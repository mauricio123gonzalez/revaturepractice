import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Iteratordemo {

	public static void main(String[] args) {
		// remove kv pairs with null values or if key is divisible by 10
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "java"); //insert
		hm.put(1000,  "openjdk"); //open jdk
		hm.put(99, "java");
		hm.put(107, null);
		hm.put(900, null);
		hm.put(105, "java");
		//hm.put(null, "java"); //only one key can be null
		System.out.println("map before deletion "+hm);
		
		//for(Entry<Integer, String> e :hm.entrySet()) {
		//	if(e.getValue()==null || e.getKey()%10==0) {
		//		hm.remove(e.getKey());
		//	}
	    //	}
		Iterator<Entry<Integer, String>> i =hm.entrySet().iterator();
		//list.iterator()  set.iterator() queue.iterator()
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next(); //read and increment, use it once per loop
			if(e.getValue()==null || e.getKey()%10==0) {
				i.remove();
				
			}
		}
		System.out.println("map after deletion : "+hm);
		

	}
/*
 * Enumerator - reads operation from top to bottom
 * Iterator - read and remove operation from top to bottom (for any collection)
 * ListIterator - read,remove,add from any direction but only with List Interface
 */
}

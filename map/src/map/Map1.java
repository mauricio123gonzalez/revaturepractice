package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "java"); //insert
		hm.put(1000,  "openjdk"); //open jdk
		hm.put(99, "java");
		hm.put(107, null);
		hm.put(900, null);
		hm.put(105, "java");
		hm.put(null, "java"); //only one key can be null
		System.out.println(hm);
		
		Map<Integer, String> lhm=new TreeMap<>();
		lhm.put(100, "java"); //insert
		lhm.put(1000,  "openjdk"); //open jdk
		lhm.put(99, "java");
		lhm.put(107, null);
		lhm.put(900, null);
		lhm.put(105, "java");
		//tm.put(null, "java"); //only one key can be null, but not in treemap
		System.out.println(lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(100, "java"); //insert
		tm.put(1000,  "openjdk"); //open jdk
		tm.put(99, "java");
		tm.put(107, null);
		tm.put(900, null);
		tm.put(105, "java");
		//tm.put(null, "java"); //only one key can be null, but not in treemap
		System.out.println(tm);
		
		Map<Integer, String> tmr=new TreeMap<>(Collections.reverseOrder());
		tmr.put(100, "java"); //insert
		tmr.put(1000,  "openjdk"); //open jdk
		tmr.put(99, "java");
		tmr.put(107, null);
		tmr.put(900, null);
		tmr.put(105, "java");
		//tm.put(null, "java"); //only one key can be null, but not in treemap
		System.out.println(tmr);
		
		Map<Integer, String> ht=new Hashtable<>(); 
		ht.put(100, "java"); //insert
		ht.put(1000,  "openjdk"); //open jdk
		ht.put(99, "java");
		//ht.put(107, null);
		//ht.put(900, null);
		ht.put(105, "java");
		//tm.put(null, "java"); //no nulls in hashtables
		System.out.println(ht);
		
		System.out.println(ht.size());
		System.out.println("ht.containsKey(100) : "+ht.containsKey(100));
		System.out.println(ht.containsValue("java"));
		System.out.println(ht.get(100));
		System.out.println(ht);
		ht.remove(100);
		System.out.println("ht after remove 100 : "+ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> hs=ht.keySet();
		System.out.println("\nIterating using keyset");
		for(Integer i:hs) {
			System.out.println("key : "+i+" value : "+ht.get(i));
		}
		//preferred method, less code
		System.out.println("\nIterating using entrySet() ");
		for(Entry<Integer, String>e :ht.entrySet()) {
			System.out.println("key -> "+e.getKey()+" value -> "+e.getValue());
		}
		
			
			
		}

	

}

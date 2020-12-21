package listspractice;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UUU
		//Unique - no duplicates in set
		//Unindexed - no positions
		//Unordered - no order by default
		//treeset will not allow a null value
		Set<String> hs=new HashSet<>();
		hs.add(null);
		hs.add("asdf");
		hs.add(null);
		hs.add("as");
		hs.add("asdf");
		System.out.println(hs);
		
		//lhs will maintain order of insertion
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add(null);
		lhs.add("asdf");
		lhs.add(null);
		lhs.add("as");
		lhs.add("asdf");
		System.out.println(lhs);
		
		//ts will not accept null values
		//this is because it is sorted in ascending, and null cannot be sorted
		Set<String> ts=new TreeSet<>();
		//ts.add(null);
		ts.add("asdf");
		//ts.add(null);
		ts.add("as");
		ts.add("asdf");
		ts.add("asdfff");
		ts.add("asdfa");
		System.out.println(ts);
		
		//descending
		Set<String> tsd=new TreeSet<>(Collections.reverseOrder()); 
		//ts.add(null);
		tsd.add("asdf");
		//ts.add(null);
		tsd.add("as");
		tsd.add("asdf");
		tsd.add("asdfas");
		tsd.add("asdfasdf");
		System.out.println(tsd);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("asdf"));
		ts.remove("asdf");
		System.out.println(ts);
		
		//Try addAll() removeAll() and retainAll()
		System.out.println("\ntraversing using for each loop");
		for(String s:ts) {
			System.out.println(s);
		}


	}

}

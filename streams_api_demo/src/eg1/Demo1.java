package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(1,2,3,2,11,12,3,4,5,6,7,8,9,10);
		
		List<Integer> lieven=new ArrayList<>();
		for(Integer i:li) {
			if(i%2==0) {
				lieven.add(i);
			}
		}
		System.out.println("list li: " +li);
		System.out.println("even list " +lieven);
		
		List<Integer> lievenStreams=li.stream().filter(i->(i%2==0)).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("stream even with reverse sort and distinct: "+lievenStreams);
		

	}

}

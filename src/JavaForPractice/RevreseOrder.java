package JavaForPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RevreseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {40,20,30,10,50,60};
		List<int[]> list = Arrays.asList(a);
		Arrays.stream(a).boxed().sorted().collect(Collectors.toList()).reversed().forEach(System.out::println); // for reverse 
		
		
		List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(list1);// get list
		Integer secondLargest = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		   System.out.println(secondLargest);
	}

}

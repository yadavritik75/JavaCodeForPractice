package JavaForPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatternCode {
public static void main(String[] args) {
	//print the 2nd smallest element in an array
	
	/*int[]array= {20,3,4,8,23,5,6,7,8};
	//List<int[]> list = Arrays.asList(array);
	List<Integer> list =Arrays.stream(array).boxed().collect(Collectors.toList());
	System.out.println(list);
	Integer secondSmallest = list.stream().sorted().skip(1).findFirst().orElseThrow();
	System.out.println(secondSmallest);*/
	
	String[] array= {"hello","hi","bye"};
	List<String> list = Arrays.asList(array);
	list.stream().filter(n->n.equalsIgnoreCase("bye")).forEach(System.out::println);
	list.stream().collect(Collectors.toList()).reversed().forEach(System.out::println);
	list.stream().map(n->n.concat(n)).forEach(System.out::println);
	
	Arrays.stream(array)
    .map(n -> n.concat(n))
    .forEach(System.out::println);
	
	
	
	
}
}

package JavaForPractice;

import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		/// Find the sum of each elements in an array
		
	    int[]array= {10,20,30,40,50};
		/*List<int[]> List = Arrays.asList(array);
		Arrays.stream(array).map(n->n+n).forEach(System.out::println);
		
		//Find the sum of all elements in an array
		int sum=Arrays.stream(array).sum();
		System.out.println("Sum of all elements in an Array =" + sum);*/
		
	    int sum=0;
	    for(int i=0;i<array.length;i++)
	    {
	    	sum= sum +array[i];
	    }
	    float average=sum/array.length;
	    System.out.println("Average "+ average);
		
System.out.println("Sum of Array " + sum);
	}

}

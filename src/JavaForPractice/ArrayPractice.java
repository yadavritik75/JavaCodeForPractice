package JavaForPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayPractice {

	public static void main(String[] args) {
		
//		//1. Find the smallest element in an array
//		int []array= {10,20,30,1,2,4,5,6,7,-9};
//		
//		int min = array[0];
//		for(int i=1; i<array.length; i++){
//		    if(array[i] < min){
//		        min = array[i];
//		    }
//		}
//		System.out.println("Smallest = " + min);
		
		
		
		
		//*************************************************************

		//2.find the second largest?
	/*	int []array= {10,20,30,1,2,4,5,6,7,-9};
		int temp ;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
		}
		System.out.println("second largest element"+array[1]);
		
	}*/
	
		//****************************************************************************
		int []array= {10,20,30,1,2,4,5,6,7,-9};
		//List<int[]> list = Arrays.asList(array);
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
	    System.out.println(list);
	Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	   System.out.println(secondLargest);
	   
	  
	}
}

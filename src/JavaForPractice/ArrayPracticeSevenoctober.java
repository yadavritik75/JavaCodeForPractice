package JavaForPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayPracticeSevenoctober {

	public static void main(String[] args) {
		/// Find the smallest element in an array
		/*
		int []array= {12,13,45,76,11,4,8,05,1};
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			
		}
		System.out.println(min);
		*/
		
		
		/// Reverse a string with using built-in functions.
		/*
		String[] list= {"steve","joe","keen","Tom"};
		List<String> NewList = Arrays.asList(list);
		List<String> reverselist = NewList.stream().collect(Collectors.toList()).reversed();
		System.out.println(reverselist);
		*/
		
		///Reverse a string without using built-in functions.
		/*
		String[] list= {"steve","joe","keen","Tom"};
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
			
			
		}
		for(int j=list.length-1;j>=0;j--)
		{
			System.out.println(list[j]);
		}
		*/
		
		///Reverse each letter of string without using built-in functions.
		/*
		String[] list= {"steve","joe","keen","Tom"};
		for(int i=0;i<list.length;i++)
		{
			String str = list[i];
			String reversed = "";
			for(int j=str.length()-1;j>=0;j--)
			{
				reversed = reversed + str.charAt(j);
			}
			System.out.println(reversed);
			*/
		///check that given string is palindrome
/*
		String word = "MADAM";
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			String Reverse="";
		for(int j=word.length()-1;j>=0;j--)
		{
			Reverse=Reverse+word.charAt(j);
		}
		if(word.equals(Reverse))
		{
			System.out.println(word + "is palindrome");
		}
		else
		{
			System.out.println(word + "is not palindrome");
		}
		
		
		
		}
		
	*/
		
		
		///print odd numbers
		//Stream.iterate(1, n->n+2).limit(100).forEach(System.out::println);
		
		///print the prime numbers 
		/*
		for(int n=2;n<100;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
		
		*/
		
		///WAP to check the prime number ?
		/*
		int[]numbers= {2,4,3,2,5,7,8,10};
		for(int i=0;i<numbers.length;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		*/
		
		///WAP to check the even number ?
		/*
		for(int n=2;n<100;n++)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
		*/
		
		///WAP to check the odd number?
		/*
		for(int n=1;n<100;n++)
		{
			if(n%2!=0)
			{
				System.out.println(n);
			}
				
		}
		*/
		
		
		///WAP to print fibonacci series 
		
		/*
		int a=0; int b=1;
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=1;i<10;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			
		}
		
		*/
		
		///Implement a method to swap two numbers without using a third variable.
		
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping a=" +a+"Before Swapping b="+b);
		
		a=a+b; // a becomes 30
		b=a-b; // b becomes 10
		a=a-b; // a becomes 20
		
		System.out.println("After swapping : a=" +a + "After swapping : b=" +b);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

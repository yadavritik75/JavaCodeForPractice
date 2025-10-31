package JavaForPractice;

public class ReverseString {

	public static void main(String[] args) {
		///Write a Java program to reverse a given string.
		
		/*
		String name="Tomo";
		String reversed="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversed=reversed+name.charAt(i);
		}
		System.out.println(reversed);
		*/
		///Reverse a string without using built-in functions.
		
		/*
		String[] list= {"steve","joe","keen","Tom"};
		for(int i=list.length-1;i>=0;i--)
		{
			System.out.println(list[i]);
		}
		*/
		
		///Reverse each letter of string without using built-in functions.
		
		/*
		String[] list= {"steve","joe","keen","Tom"};
		
		for(int i=0;i<list.length;i++)
		{
		String str=list[i];
		String reversed="";
		for(int j=str.length()-1;j>=0;j--)
		{
			reversed=reversed+str.charAt(j);
		}
		System.out.println(reversed);
		}
		*/
		
		///print the prime numbers 
		/*
		for(int i=2;i<100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}if(count==2)
			{
				System.out.println(i);
			}
			
		}
		*/
	}
	

}

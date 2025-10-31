package JavaForPractice;

public class codepractice {

	public static void main(String[] args) {
		///print prime numbers between 1 to 100
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
		
	///Reverse a string — without using built-in functions.
	/*
	String name = "Steve";
	String reversed=" ";
	for(int i=name.length()-1;i>=0;i--)
	{
		reversed=reversed+name.charAt(i);
	}
	System.out.println(reversed);
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
		
		///Reverse a string without using built-in functions.
		/*
		String[] list= {"steve","joe","keen","Tom"};
		for(int i=list.length-1;i>=0;i--)
		{
			System.out.print(list[i]);
			System.out.print("\t");
			
		}
		*/
		
		///Check if a string is palindrome
		/*
		String name="MADAM";
		String reversed="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversed=reversed+name.charAt(i);
		}
		if(name.equals(reversed))
		{
			System.out.println(name +"is palindrome");
		}
		else
		{
			System.out.println(name +"is not palindrome");
		}
		
		*/
		///Find factorial of a number using loop or recursion.
		/*
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		*/
		///Check if a number is prime or not.
		
		int[] number= {11,1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<number.length;i++)
		{
			int count=0;
			for(int j=1;j <= number[i];j++)
			{
				if(number[i]%j==0)
				{
					count++;
				}
			}if(count==2)
			{
				System.out.println(number[i]);
			}
			
		}
		
		
		
		
		
	}
}

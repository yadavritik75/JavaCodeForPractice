package JavaForPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Array2practice {

	public static void main(String[] args) {
		/// Find the smallest element in an array
		/*
		 * int[]array= {11,11,6,4,7,3,5,1,8,30}; int max=array[0]; for(int
		 * i=1;i<array.length;i++) { if(array[i]>max) { max=array[i];
		 * 
		 * } } System.out.println(max);
		 */
		/// Reverse a string with using built-in functions.
		/*
		 * String[] list={"john","steve","Maclen","keen"}; List<String> newL =
		 * Arrays.asList(list); List<String> Revr =
		 * newL.stream().collect(Collectors.toList()).reversed();
		 * System.out.println(Revr);
		 */

		/// Reverse a string without using built-in functions.
		/*
		 * String[] list={"john","steve","Maclen","keen"}; for(int
		 * i=0;i<list.length;i++) { System.out.println(list[i]);
		 * 
		 * } for(int j = list.length-1;j>=0;j--) { System.out.println(list[j]);
		 * 
		 * }
		 */

///check that given string is palindrome
		/*
		 * String word = "MADAM"; 
		 * String reverse=""; 
		 * for(int i=word.length()-1;i>=0;i--)
		 * {
		 *  System.out.println(word.charAt(i));
		 *  
		 *  reverse = reverse + word.charAt(i);
		 *   }
		 * if(word.equals(reverse)) 
		 * {
		 *  System.out.println(word + "is palindrome");
		 *  } 
		 *  else
		 *  
		 * { System.out.println(word + "is not palindrome"); 
		 * }
		 */

///check that given number is palindrome 
/*
		int number = 121;
		
		String reverse="";
		String str = Integer.toString(number);
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(str+ "is palindrome");
		}
		else
		{
			System.out.println(str+ "is not  palindrome");
		}
		
*/
		
	/// Print Ascii values of all characters 
	/*
		String Str = "Programming";
		
		List<Integer> ls = Str.chars().boxed().collect(Collectors.toList());
		System.out.println(ls);
		*/
		
	///	Remove duplicate characters from a string.
/*
		String str="Programming";
		String result="";
		for(int i=0;i<str.length();i++)
		{ 
			char ch=str.charAt(i);
			if(result.indexOf(ch)== -1)
			{
			    result = result + ch;

			}
		}
		System.out.println(result);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

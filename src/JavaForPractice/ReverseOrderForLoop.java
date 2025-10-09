package JavaForPractice;

public class ReverseOrderForLoop {

	public static void main(String[] args) {
		// Reverse the Array 
		
		int[]array= {10,20,30,40,50,60};
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			System.out.print( " " );
		}
			System.out.println( " ");
			
			for(int j=array.length-1 ;j>=0;j--)
			{
				System.out.print(array[j]);
				System.out.print( " " );
			}
		}

	}



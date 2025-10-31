package JavaForPractice;

public class Arraypractice13oct {
 
	public static void main(String[] args) {
	/*
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 
		int k=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
		}
		
		
		*/
		
		/*
		 1
		 1 2
		 1 2 3 
		 1 2 3 4
		 
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		
		*/
		
		
		/*
		 1
         22
         333
         4444
         55555

		 
		
		for(int i=0;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println("");
		}
*/
	
		/*
		 5
         54
         543
         5432
         54321

		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=6-i;j--)
			{
				System.out.print(j);
			
			}
			System.out.println("");
		}
		
		
	}
	
}

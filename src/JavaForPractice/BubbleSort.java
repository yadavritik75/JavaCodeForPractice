package JavaForPractice;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []a= {12,34,56,76,78,10};
		int temp;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0)
			{
				break;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("Second largest Number " +a[1]);
		System.out.println("Hello World1" );
		System.out.println("Hello World2" );
		System.out.println("Hello World3" );
		System.out.println("Hello World4" );
		System.out.println("Hello World5" );
	}
	
	
}

package JavaForPractice;

public class SecondSmallest {

	public static void main(String[] args) {
		// Find the smallest element in an array
		int[]array= {10,30,20,60,7};
		int min=array[0];
		int temp;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		
		System.out.println(min);
	}
}

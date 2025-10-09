package JavaForPractice;

public interface  Practice02Interface {
public abstract	void low(); // by default public abstract
public static final int a = 0; //by default variable is static final

public static void main(String[] args) {
	
}
public interface xyz extends Practice02Interface
{

	public default void low()
	{
		
	}
	
}

}
 class deny implements Practice02Interface {

	@Override
	public void low() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 class agree implements Practice02Interface
 {

	@Override
	public void low() {
		// TODO Auto-generated method stub
		
	}
	 
 }


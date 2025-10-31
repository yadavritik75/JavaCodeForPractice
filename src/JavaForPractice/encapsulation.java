package JavaForPractice;

public class encapsulation {
	private String name;
	public void setName(String n)
	{
		name=n;
		
	}
	public String getName()
	{
		return name;
		
	}
public static void main(String[] args) {
	encapsulation e=new encapsulation();
	e.setName("ritik");
	System.out.println(e.getName());
}
}

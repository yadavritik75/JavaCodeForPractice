package JavaForPractice;
class Calculator {

    // Method 1
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    // Method 2 - same name but different parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    // Method 3 - same name, different data types
    void add(double a, double b) {
        System.out.println("Sum of two double numbers: " + (a + b));
    }
}
public class polyMorphism {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		 c.add(10, 20);          // Calls method 1
	        c.add(10, 20, 30);      // Calls method 2
	        c.add(5.5, 4.5);        // Calls method 3

	}

}

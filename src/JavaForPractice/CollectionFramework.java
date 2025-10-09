package JavaForPractice;

import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("hello");
		al.add(0, "first");
		al.add('a');
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(30);
		al2.add(50);
		al2.add(89);
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		al2.remove(0);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		System.out.println(al2.contains(50));
		
		
		
		
	}

}

package core.concepts;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		System.out.println("hi");
		Scanner faizal = new Scanner(System.in);
		System.out.println("enter your initial:");
		char initail =faizal.next().charAt(0);
		System.out.println("enter your name:");
		String name =faizal.next();
		System.out.println("enter your age:");
		int age=faizal.nextInt();
		System.out.println("enter your mobile number");
		long number=faizal.nextLong();
		System.out.println("enter your percentage:");
		float percentage=faizal.nextFloat();
		
		
		System.out.println("your initail is: " +initail);
		System.out.println("your name is:" + name );
		System.out.println("your age is:" + age);
		System.out.println("your mobile number is:" +number);
		System.out.println("your percentage is:" + percentage);
	 
	}

}

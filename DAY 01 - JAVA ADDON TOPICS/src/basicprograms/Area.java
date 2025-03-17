package basicprograms;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the radius of circle");
		int r =in.nextInt();
		double n = (22/7.0)*r*r;
		System.out.println("awnser:" + n);
	}

}

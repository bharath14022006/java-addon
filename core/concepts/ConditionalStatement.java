package core.concepts;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter your maritial status:(married/unmarried):");
		String ms = in.nextLine();

		if (ms.equals("married")) {
			System.out.println("you are eligible to insurance");
		} else if (ms.equals("unmarried")) {
			System.out.println("you are not eligible to insurance");
			System.out.println("enter the below detials");
			System.out.println("enter the gender: (male/female)");
			String gender = in.nextLine().toLowerCase();
			if (gender.equals("male")||gender.equals("female")){
				System.out.println("enter the age");
				int age = in.nextInt();
				if(gender.equals("male")&&age>=30) {
					System.out.println("eligiable for insurance");
				}else if(gender.equals("female")&&age>=18) {
					System.out.println("eligiable for insurance");
				}if(gender.equals("male")&&age<30) {
					System.out.println("eligiable for not insurance");
				}else if(gender.equals("female")&&age<18) {
					System.out.println("eligiable for not insurance");
				}

			}
			else {
				System.out.println("invalid gender input");
			
			}
		}
			else {
				System.out.println("invalid marriage input");
			
			}
		
	}
}
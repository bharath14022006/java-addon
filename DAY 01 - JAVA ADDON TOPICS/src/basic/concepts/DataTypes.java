package basic.concepts;

public class DataTypes {

	public static void main(String[] args) {
		// primitive data types
		// number type 
		byte a =127;
		short b =32_767;
		int c =2_147_483_647;
		long d =9_223_372L;
		
		// float type
		float e = 1.123456789f; // 6 to 7 digits
		double f =1.12345678910111245; // 16 digits
		
		// boolean
		boolean status = true;
		
		// char type
		char initial ='r' ;
		
		// non primitive data types
		String name = "abc";
		
		
			
		//display output
		System.out.println("bype representation:" + a);
		System.out.println("short representation:" + b);
		System.out.println("int representation:" + c);
		System.out.println("long representation:" + d);
		
		System.out.println("float representation:" + e);
		System.out.println("double representation:" + f);
		
		System.out.println("boolean representation:" + status);
		System.out.println("char representation:" + initial);
		
		System.out.println("string representation:" + name );
	}

}

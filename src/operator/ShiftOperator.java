package operator;

public class ShiftOperator {
	
	public static void main(String[] args) {
		int y = 10;
		
		// x * 2^n
		System.out.println(y << 2);// 
		System.out.println(y << 3);// 
		System.out.println(y << 4);// 10 * 2^4 = 10*16 = 160
		System.out.println(y << 5);// 
		
		// x / 2^n
		System.out.println(y >> 2);// 2
		System.out.println(y >> 3);// 1
		System.out.println(y >> 4);// 0 = 10/16
		System.out.println(y >> 5);// 0
		
		System.out.println(y >>> 2);
		System.out.println(y >>> 3);
	}

}
package string;

public class Convert_StringTo_Integer {
	public static void main(String[] args) {
		String str = "1234";
		int result = Integer.parseInt(str);
		//using Integer.parseInt()
		//int result2 = Integer.value(str);
		//using Integer.valueof()
		
		System.out.println("The converted int is: " + result);
	}

}

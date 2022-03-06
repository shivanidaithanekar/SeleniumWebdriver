package operator;

public class RelationalOperator {
	
	public static void main(String[] args) {
		int p = 200;
		int q = 300;
		int r = 1000;
		int s = 300;
		
		System.out.println(p < q);// True
		System.out.println(r > q);// True
		System.out.println(s <= r);// True
		System.out.println(q >= p);// True
		System.out.println(p == q);// False
		System.out.println(q == s);// True
		System.out.println(q != s);// False
		System.out.println(r != p);// True
		RelationalOperator t = new RelationalOperator();
		System.out.println(t instanceof RelationalOperator);// 
		// Object is Instance of a Class
		
	}
	

}
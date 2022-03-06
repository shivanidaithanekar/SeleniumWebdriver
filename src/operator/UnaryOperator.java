package operator;

public class UnaryOperator {

	public static void main(String[] args) {

		// ++ = +1
		// ++ = 1+

		int a = 10;
		System.out.println(a);// 10
		System.out.println(a++);// 10 + 1 = (11)
		System.out.println(a++);//11 + 1 = (12)
		System.out.println(a++);//12

		int b = 100;
		System.out.println(b);// 100
		System.out.println(b--);//100
		System.out.println(b--);//99
		System.out.println(b);//98


		int f = 50;
		System.out.println(f);// 50
		System.out.println(++f);//51 1 +50
		System.out.println(++f);// 52
		System.out.println(++f);// 53

		int p = 500;
		System.out.println(p);// 500
		System.out.println(--p);// 499 500 -1
		System.out.println(--p);// 498
		System.out.println(--p);// 497


		int h = 30;
		System.out.println(h);// 30
		System.out.println(+h);// 30
		System.out.println(+h);// 30

		int t = -40;
		System.out.println(t);// 40
		System.out.println(-t);// -40
		System.out.println(-t);// -40


		int r = 61;
		int s = 62;
		boolean w = 200<300;
		
		System.out.println(r);
		System.out.println(~r);//- (12+1) -(n+1)
		System.out.println(~(r+s));// - (61 + 62 +1) = -124
		System.out.println(!w);
		
	}

}

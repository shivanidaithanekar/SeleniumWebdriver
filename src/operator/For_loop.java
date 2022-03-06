package operator;

public class For_loop {
	int a;
	public void even() {
		for(a=1;a<=100;a++) 
		{
			if(a%2==0) {
			System.out.println(a);
		}
	}
	}


public void odd () {
	for(a=1;a<=100;a++) {
		if(a%2==1) {
		System.out.println(a);
	}
}
}
public static void main(String[] args) {
	For_loop o = new For_loop();
	o.even();
	o.odd();
}
}


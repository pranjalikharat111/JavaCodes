package Inheritance;

public class Double extends Single {
public void m3() {
	System.out.println("mtd m3");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Single s= new Single();
s.m1();
s.m2();
Double d= new Double();
d.m3();

	}

}

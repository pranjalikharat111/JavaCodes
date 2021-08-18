package overloading;

public class Case2 {
public static void main(int i) {
	System.out.println("2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1");
Case2 c2= new Case2();

c2.main(14);
	}
}

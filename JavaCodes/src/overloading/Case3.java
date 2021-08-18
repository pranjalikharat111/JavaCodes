package overloading;

public class Case3 {
void show(	int a) {
	System.out.println("int method");
}
void show(int ...is) {
	System.out.println(" int varc method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Case3 c3= new Case3();
c3.show(12);
c3.show(56,78,9);

	}

}

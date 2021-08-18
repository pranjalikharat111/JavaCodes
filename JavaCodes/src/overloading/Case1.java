package overloading;

public class Case1 {

	void show() {
		System.out.println("1");
	}
	Float show(int a) {
		System.out.println("2");
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Case1 c1= new Case1();
c1.show();
c1.show(12);
	}

}

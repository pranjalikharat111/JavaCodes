package Iterface;

public class Test implements I1,I2 {

	

	
	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t= new Test();
t.show();
t.show1();
t.diplay1();
System.out.println(i);

	}
}

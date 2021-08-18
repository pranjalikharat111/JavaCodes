package Inheritance;

public class C extends B {
public void dance() {
	System.out.println("i am dancing");
}
public void watch() {
	System.out.println("i am watching");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c= new C();
c.eat();
c.dance();
c.watch();

A a = new A();
a.eat();
B b= new B();

b.sleep();
b.walk();


	}
	

}

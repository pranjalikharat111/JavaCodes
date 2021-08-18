package Abstraction;

public class Scooter extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c= new Car();
c.start();
c.stop();
Scooter s= new Scooter();
s.start();
c.stop();
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("strating with kick");
	}

}

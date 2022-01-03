package SuperKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassA {

public static void main(String[] args) {
	try {
		System.out.println("1");
		int a=20;
		System.out.println("2");
		int b=4;
		System.out.println("3");
		int c=a/b;
		System.out.println(c);
		System.out.println("4");
	}
	catch(Exception e) {
		System.out.println("5");
		System.out.println(e);
		System.out.println("6");
	}
	
	
	System.out.println("hello");

}
}
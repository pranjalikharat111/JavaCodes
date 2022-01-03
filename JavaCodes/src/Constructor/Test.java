package Constructor;

import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		ReadAndWrite rw= new ReadAndWrite();
		
			rw.readFile();
		
		System.out.println("hello");
	}
}

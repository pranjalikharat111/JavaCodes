package Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readFile() throws FileNotFoundException {
FileInputStream fis= new FileInputStream("d/abc.txt") ;
	

}
	void saveFile() throws FileNotFoundException {
		FileOutputStream fos= new FileOutputStream("a/sd.txt");
	}
}

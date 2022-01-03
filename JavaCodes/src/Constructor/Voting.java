package Constructor;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter your age");
int  age= sc.nextInt();
try {
if(age<18) {
	throw new YoungerAgeException("you are not eligible");
	//System.out.println("tuhfuiff");
}
else {
	System.out.println("you are eligible");
}

	}catch(Exception e) {
		System.out.println(e);
	}
System.out.println("hello");
}
}
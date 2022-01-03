package String;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
System.out.println("Enter The String");
String s= sc.nextLine();
int count[]= new int[256];
for(int i=0;i<s.length();i++) {
	count[s.charAt(i)]++;
}
char a[]= new char[s.length()];
for(int i=0;i<s.length();i++) {
	a[i]=s.charAt(i);
	int found=0;
	for(int j=0;j<s.length();j++) {
		if(s.charAt(i)==a[j]) 
			found++;
		
	}if(found==1)
		System.out.println("occurance of word"+s.charAt(i)+"count"+count[s.charAt(i)]);
}
}
}
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name");
	String s= sc.nextLine();
	int count[]= new int[256];
	for( int i=0;i<s.length();i++) {
		count[s.charAt(i)]++;
		
	}
	char a[]= new char[s.length()];
	for(int i=0;i<s.length();i++) {
		a[i]=s.charAt(i);
		int found=0;
		for(int j=0;j<=i;j++) {
			if(s.charAt(i)==a[j])
			found++;
		}
	if(found==1)
		System.out.println("number of occurance "+s.charAt(i)+"is"+count[s.charAt(i)]);
	
	}
	}
	}
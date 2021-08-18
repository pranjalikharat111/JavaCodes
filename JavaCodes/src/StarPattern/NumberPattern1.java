package StarPattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
for(int i=1;i<=4;i++) {
	for(int j=3;j>=i;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" "+(a++));
	}System.out.println("");
}
for(int i=4;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.println(" ");
	}
for(int k=1;k<=i;k++) {
	System.out.print(" "+(a++));
}
System.out.println("");
		

	}

}
}
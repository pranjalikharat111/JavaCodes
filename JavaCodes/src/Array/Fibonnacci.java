package Array;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int se=0;
System.out.println("a="+a+"\tb="+b);
for(int i=0;i<=10;i++ ) {
	se=a+b;
	System.out.println(""+se);
	a=b;
	b=se;
}

	}

}

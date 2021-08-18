package String;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=121;
 int temp=num;
 int rev=0,rem=0;
 while(temp!=0) {
	 rem=temp%10;
	 rev=rev*10+rem;
	 temp=temp/10; 
 }System.out.println(rev);
 if(num==rev) {
	 System.out.println("pallindrome no");
 }else {
	 System.out.println("no is not pallindrome");
 }
	}

}

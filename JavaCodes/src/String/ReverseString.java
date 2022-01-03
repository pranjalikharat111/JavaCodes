package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=" i live in india";
String rev="";
 int leng= s.length();
for(int i=leng-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
System.out.println(rev);
if(s.equals(rev)) {
	System.out.println("pallindrome string");
}
else {
	System.out.println("not pallindrome string");
}

	}
}
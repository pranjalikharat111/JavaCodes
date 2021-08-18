package String;

public class StringComaprison {

	public static void main(String[] args) {
		String s1="LTI";
		String s2="LTI";
		String s3=s2;
		String s4=new String("LTI");
		String s6= new String("LTI");
		String s5="Lti";
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));//true
		System.out.println(s3==s1);//true
		System.out.println(s4==s1);//false
		System.out.println(s4.equals(s3));//true
		System.out.println(s4==s3);//false
		System.out.println(s5==s1);//false
		System.out.println(s5.equals(s4));//false
		System.out.println(s4==s6);//false
		System.out.println(s4.equals(s6));//true
		
	}
}
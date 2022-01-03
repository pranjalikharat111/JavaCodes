package pratice;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String substring="prrrrrrranjaliaaaa";
char somechar='r';
int count=0;
for(int i=0;i<substring.length();i++) {
	if(substring.charAt(i)==somechar) {
		count++;
		
	}
}System.out.println("dublicate char="+count);
}
}
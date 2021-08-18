package String;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String somestring="prrrrrraanjali";
char somechar='r';
int count=0;
for(int i=0;i<somestring.length();i++) {
	if(somestring.charAt(i)==somechar) {
		count++;
	}
}System.out.println("Occurances of somechar="+count);
	}

}

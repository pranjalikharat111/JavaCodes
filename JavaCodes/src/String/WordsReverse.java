package String;

public class WordsReverse {
	public static void main(String[] args) {
		String s = "I:Live:In:India";
		String[] sarray = s.split(":");
		String reverse = "";
		for(int i = sarray.length-1; i>=0;i--) {
			reverse = reverse + (sarray[i] + " ");
			
		}
		System.out.println(reverse);

	}
}
//[i live in india]=sarray
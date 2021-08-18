package String;

import java.util.Scanner;

public class EachWordsReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a String to reverse:");
        String str = scan.nextLine();
        String[] words = str.split(" ");    
        String reverseString = "";
        for(int i = 0;i<words.length;i++) {
        	String eachword = words[i];
        	String reverseeachword = "";
for(int j =  eachword.length()-1; j >=0;j--) {
        		reverseeachword = reverseeachword + eachword.charAt(j);
        	}
        	reverseString = reverseString + reverseeachword + " ";
        }
        System.out.println(reverseString);
	
}
}
// //[pranjali is tester]= words
//i=0
//eachword=words[pranjali]      

//		eachword=pranjali;
//reverseword=""
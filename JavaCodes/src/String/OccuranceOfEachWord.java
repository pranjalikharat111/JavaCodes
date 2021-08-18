package String;

import java.util.Scanner;

public class OccuranceOfEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		int count[]=new int[256];
		
		for(int i=0;i<s.length();i++) {

			count[s.charAt(i)]++;  //count of character;
		}

		char a[] = new char[s.length()];
		for(int i=0;i<s.length();i++) {

			a[i] = s.charAt(i); //stored each character in char array
			int found=0;
			for(int j=0;j<=i;j++) { // found 
				if(s.charAt(i)==a[j])
					found++;
			}

			if(found ==1)
				System.out.println("Number of occurances:"+ s.charAt(i)+ "  is "+ count[s.charAt(i)]);


		}

	}

}

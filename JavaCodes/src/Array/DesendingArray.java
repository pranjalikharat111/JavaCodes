package Array;

import java.util.Scanner;

public class DesendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of array");
int a[]= new int[5]; int temp=0;
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
}for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
System.out.println(a[i]+ " ");
}
}

}

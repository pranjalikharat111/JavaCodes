package Array;

public class InserctionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,3,5,7,9};
int arr2[]= {2,4,3,9,7,8};
int m=arr1.length;
int n=arr2.length;
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		if(arr1[i]==arr2[j]) {
			System.out.println(arr1[i]);
		}
		
	}
}
	}

}

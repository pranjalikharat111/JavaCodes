package Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {-1,2,1,3,5,6,2,0};
int sum=4;
for(int i=0;i<arr.length-1;i++) {
	for(int j=i+1;j<arr.length-1;j++) {
		if(arr[i]+arr[j]==sum) 
			System.out.println(arr[i]+" "+arr[j]);
		
	}
}
	}

}

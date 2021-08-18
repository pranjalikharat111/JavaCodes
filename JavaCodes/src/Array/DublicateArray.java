package Array;

public class DublicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {55,22,55,10,46,22,55,88,33,44};
for(int i=0;i<arr.length;i++) {
	int count=0;
	int flag=0;
	int current=arr[i];
	for(int j=0;j<arr.length;j++) {
		if(current==arr[j]) {
			count++;
			flag=1;
			
		}
	}if(flag==1&&count>2) 
	System.out.println("dublicate element="+current+"and count is="+count);

}
}
}
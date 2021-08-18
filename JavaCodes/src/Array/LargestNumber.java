package Array;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] list= {1,6,9,3,56,65};
int largest=0;
for(int num:list) {
	if(largest<num) {
		largest=num;
	}
}System.out.println(largest);
	}

}

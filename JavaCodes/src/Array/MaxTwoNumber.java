package Array;

public class MaxTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list[]= {15,79,48,21,43,11,18,13};
int max1=0,max2=0;
for(int num:list) {
	if(max1<num) {
		max2=max1;
		max1=num;
	}
	else if(max2<num) {
		max2=num;
	}
}System.out.println("max1-"+max1+"\tmax2-"+max2);
}
}
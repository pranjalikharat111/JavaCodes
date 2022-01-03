package pratice;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list[]= {22,15,37,89,78,90};
int max1=0,max2=0;
for(int num:list) {
	if(max1<num) {
		max2=max1;
		max1=num;
	}else if(max2<num) {
		max2=num;
		
	}
}System.out.println("max1-"+max1+"\tmax2-"+max2);
}
}
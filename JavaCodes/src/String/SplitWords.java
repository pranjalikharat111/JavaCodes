package String;

public class SplitWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" i live in india";
		String[] split=s.split("");
		String result="";
		for(int i=split.length-1;i>0;i--) {
			result=result+(split[i]+"");
		}
		System.out.println(result);
		
		

}

	
}
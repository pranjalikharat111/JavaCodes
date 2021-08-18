package Inheritance;

public class Videoing extends Calling{
public void video() {
	System.out.println("video");
}
public void dance() {
	System.out.println("dancing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chatting c= new Chatting();// calling mtd only parent class
c.mms();
c.msg();
Calling c1= new Calling();// parent and child mtd call 
c1.voicecall();
c1.mms();
c1.msg();
Videoing v = new Videoing();//parent +2 child
v.mms();
v.msg();
v.voicecall();
v.video();
v.dance();
Chatting c2= new Calling();// parent mtd call;object of child assign to reference of parent
c2.mms();
c2.msg();
Calling c3= new Videoing();// runtime phenophena
c3.mms();
c3.msg();
c3.voicecall();


	}

}

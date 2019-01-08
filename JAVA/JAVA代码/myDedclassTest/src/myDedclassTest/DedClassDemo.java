package myDedclassTest;

public class DedClassDemo {

	public static void main(String[] args) {
		
		kid1 k=new kid1();
		k.show();
	}

}

class Dad1{
	String name="zhou";
	
}
class kid1 extends Dad1{
	String name="wqc";
	//extends ผฬณะ

public void show(){
	String name="wwqqcc";
	System.out.println(name);
	System.out.println(super.name);
	System.out.println(this.name);
}
}
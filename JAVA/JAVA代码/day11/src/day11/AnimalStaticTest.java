package day11;

public class AnimalStaticTest {
	public static void main(String[] args) {
		
		Animal animal=null;
		
		animal.weight=300.0;
		
		Animal.weight=400.0;
		
		Animal animal1=new Animal();
		
		Animal.cry();
		
		animal1.crry();
		
		//只有实例化后，可以使用静态变量
		
	}
}

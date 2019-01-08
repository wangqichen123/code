package day11_03;
/**
 * Teacher 类继承了person 类
 * @author WQC
 * @version 1.0
 */
public class Teacher extends Person{
	//成员变量属性
	private String Tnum;
	private int workyear;
	
	
	public Teacher(String name, int age, char sex) {
		super(name, age, sex);
		
	}



	//构造函数的重载
	public Teacher(String name, int age, char sex, String tnum, int workyear) {
		super(name, age, sex);
		Tnum = tnum;
		this.workyear = workyear;
	}

	

	public String getTnum() {
		return Tnum;
	}

	public void setTnum(String tnum) {
		Tnum = tnum;
	}

	public int getWorkyear() {
		return workyear;
	}

	public void setWorkyear(int workyear) {
		this.workyear = workyear;
	}
	
	

}

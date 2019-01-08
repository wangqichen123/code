package day11_04;

public class Student extends Person {

	//扩展学生的一些成员变量
	private String stuNum;
	private String classRoom;
	private String grade;
	
	//创建构造函数
	public Student(String name, int age, char sex, String stuNum, String classRoom, double d) {
		//super 调用了父类的构造方法
		super(name, age, sex);
		this.stuNum = stuNum;
		this.classRoom = classRoom;
		this.grade = grade;
	}
	public void shou(){
		System.out.println("子类的show 方法");
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}

package day11_04;

public class Student extends Person {

	//��չѧ����һЩ��Ա����
	private String stuNum;
	private String classRoom;
	private String grade;
	
	//�������캯��
	public Student(String name, int age, char sex, String stuNum, String classRoom, double d) {
		//super �����˸���Ĺ��췽��
		super(name, age, sex);
		this.stuNum = stuNum;
		this.classRoom = classRoom;
		this.grade = grade;
	}
	public void shou(){
		System.out.println("�����show ����");
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

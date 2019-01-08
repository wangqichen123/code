package day11_03;
/**
 * Teacher ��̳���person ��
 * @author WQC
 * @version 1.0
 */
public class Teacher extends Person{
	//��Ա��������
	private String Tnum;
	private int workyear;
	
	
	public Teacher(String name, int age, char sex) {
		super(name, age, sex);
		
	}



	//���캯��������
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

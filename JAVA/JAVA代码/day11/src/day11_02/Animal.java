package day11_02;
/*
 * ��̬�����������
 * �����������ִ�ж�Σ��ڴ��������ʱ��ʹ��
 * ���ȼ�: ���Ǿ�̬�������� >��������> ���캯��
 * 
 */
public class Animal {
	//����ĳ�Ա����  ��װ  private
	private String name;
	public char sex;
	//��static ���εĳ�Ա����
	private static String move="�ᶯ";
	public static double weight=200.0;
	static{
		int age=10;
		System.out.println("��̬��������");
	}
	
	
	
	//�����޲ι��캯��
	public Animal(){
		
	}
	//����һ����̬����
	public static void cry(){
		//��̬�������ܹ�ʹ�÷Ǿ�̬�ı���
		//System.out.println(name+"is crying");
		System.out.println(move);
	}
	//����һ���Ǿ�̬����
	public void crry(){
		//�Ǿ�̬�����������ʹ�þ�̬�ı���
		System.out.println(name);
	}
}

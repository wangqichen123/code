package day11;
/*
 * static 
 * ��1����Ҫ����������ĳ�Ա����Ա������������
 * 		main ���� static ����
 * ��2��static �ص�
 * static ���εĳ�Ա�������ʱֱ�����У����ȼ��ϸ�
 * ͨ������ֱ�ӷ��� ����.��Ա
 * 	(3) static ��������ж��������ֵ��ͬʱ��ʹ��
 * static ����
 *  (4)��̬�����
 *  Ϊ�˷�������ĳ�ʼ��
 * 
 */
public class Animal {
	//����ĳ�Ա����  ��װ  private
	private String name;
	public char sex;
	//��static ���εĳ�Ա����
	private static String move="�ᶯ";
	public static double weight=200.0;
	
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

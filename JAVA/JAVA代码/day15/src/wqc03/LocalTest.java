package wqc03;
/**
 * �ֲ��ڲ����ʵ����
 * @author WQC
 *
 */
public class LocalTest {
	public static void main(String[] args) {
		
		
		//step 1 ʵ�����ⲿ��
		
		Woman woman=new Woman();
		//strp 2ͨ����̬ ���Man����
		People man=woman.getMan();
		//man �ķ���
		man.show();
	}
	
	
}

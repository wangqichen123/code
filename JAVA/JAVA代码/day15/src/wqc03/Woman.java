package wqc03;
/**
 * �� woman ����������һ���ֲ��ಿ��
 * @author WQC
 *
 */
public class Woman {
		
	//��Ա����
	private String skirt="����ȹ";
	private static double apLever;
	public Woman(){
		
	}
	//��̬
	public  People getMan(){
		
		class Man extends People{
			
			//�ֲ��ڲ����Ա����
			
			private String beard;
			//�ֲ��ڲ��๹�캯��
			public Man(){
				
				
			}

			public String getBeard() {
				return beard;
			}

			public void setBeard(String beard) {
				this.beard = beard;
			}
			
		}
		
		return new Man();
	}
	public void show(){
		
		//�ֲ��ڲ�����Է����ⲿ��ľ�̬ ��Ǿ�̬�ĳ�Ա�����ͷ���
		
		System.out.println("�ⲿ��ĳ�Ա����"+skirt);
		
		System.out.println(apLever);
		
		System.out.println("�ֲ��ڲ���-������");
	}
	
	public String getSkirt() {
		return skirt;
	}
	public void setSkirt(String skirt) {
		this.skirt = skirt;
	}
}

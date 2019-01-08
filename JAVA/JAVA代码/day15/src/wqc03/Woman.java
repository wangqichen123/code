package wqc03;
/**
 * 在 woman 类里面申明一个局部类部类
 * @author WQC
 *
 */
public class Woman {
		
	//成员变量
	private String skirt="连衣裙";
	private static double apLever;
	public Woman(){
		
	}
	//多态
	public  People getMan(){
		
		class Man extends People{
			
			//局部内部类成员变量
			
			private String beard;
			//局部内部类构造函数
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
		
		//局部内部类可以访问外部类的静态 或非静态的成员变量和方法
		
		System.out.println("外部类的成员变量"+skirt);
		
		System.out.println(apLever);
		
		System.out.println("局部内部类-好男人");
	}
	
	public String getSkirt() {
		return skirt;
	}
	public void setSkirt(String skirt) {
		this.skirt = skirt;
	}
}

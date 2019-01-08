package wqc03;
/**
 * 局部内部类的实例化
 * @author WQC
 *
 */
public class LocalTest {
	public static void main(String[] args) {
		
		
		//step 1 实例化外部类
		
		Woman woman=new Woman();
		//strp 2通过多态 获得Man对象
		People man=woman.getMan();
		//man 的方法
		man.show();
	}
	
	
}

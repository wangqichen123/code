package myTest;

public class EscapeChara {
    public static void main(String[] args){
    	char c='\7'; //代表一个bell 
    	char c2='\101';	//大写字母A 对应的ASCII 65转成8进制
    	System.out.println("c2="+c2+",c="+c);
    	
    	//16进制 Unicode 转义字符
    	char c3='\u0021';
    	System.out.println("c3="+c3);
    	
    	//特殊字符
    	/*    \":表示双引号
    	 *    \':单引号	
    	 *    \\:反斜线	
    	 *  
    	 */
    	
    	/*控制字符
    	 * \r:回车
    	 * \n:换行
    	 * \t:tab
    	 * \b:退格
    	 */
    	
    	
    }
}

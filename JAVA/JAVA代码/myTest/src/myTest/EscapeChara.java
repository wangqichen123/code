package myTest;

public class EscapeChara {
    public static void main(String[] args){
    	char c='\7'; //����һ��bell 
    	char c2='\101';	//��д��ĸA ��Ӧ��ASCII 65ת��8����
    	System.out.println("c2="+c2+",c="+c);
    	
    	//16���� Unicode ת���ַ�
    	char c3='\u0021';
    	System.out.println("c3="+c3);
    	
    	//�����ַ�
    	/*    \":��ʾ˫����
    	 *    \':������	
    	 *    \\:��б��	
    	 *  
    	 */
    	
    	/*�����ַ�
    	 * \r:�س�
    	 * \n:����
    	 * \t:tab
    	 * \b:�˸�
    	 */
    	
    	
    }
}

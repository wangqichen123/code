package myTest;
/**
 * 
 * �������  a*b  a������ Ҫ���� b������
 * A[i][k] *b[k][j]
 * @author WQC
 * @version 1.0
 */
public class DouArrayTest02 {

	public static void main(String[] args) {
		//������������ A=[2*2] B[1*2]
		int [][] A={{1,2},{3,4}};
		int [][] B={{1},{2}};
		int [][] C=new int [A.length][B[0].length];
		
		//��C����ֵ  ��̬��ֵ
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B[0].length;j++){
				for(int k=0;k<B.length;k++){
					C[i][j]+=A[i][k]*B[k][j];
					
				}
			}
		}
		//for ѭ��������н��
		for(int i=0;i<C.length;i++){
			for(int j=0;j<B[0].length;j++){
				System.out.println(C[i][j]+"/t");
			}
			System.out.println();
		}
		
	}
}

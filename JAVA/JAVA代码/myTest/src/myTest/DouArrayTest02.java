package myTest;
/**
 * 
 * 矩阵相乘  a*b  a的列数 要等于 b的行数
 * A[i][k] *b[k][j]
 * @author WQC
 * @version 1.0
 */
public class DouArrayTest02 {

	public static void main(String[] args) {
		//定义两个矩阵 A=[2*2] B[1*2]
		int [][] A={{1,2},{3,4}};
		int [][] B={{1},{2}};
		int [][] C=new int [A.length][B[0].length];
		
		//给C矩阵赋值  动态赋值
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B[0].length;j++){
				for(int k=0;k<B.length;k++){
					C[i][j]+=A[i][k]*B[k][j];
					
				}
			}
		}
		//for 循环输出运行结果
		for(int i=0;i<C.length;i++){
			for(int j=0;j<B[0].length;j++){
				System.out.println(C[i][j]+"/t");
			}
			System.out.println();
		}
		
	}
}

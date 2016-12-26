package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。
 * Date: 2016/12/26
 * Author: 105021030 張廷毓
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data[][]=new int[2][n];
		for(int i=0;i<n;i++){
			int data2,sum=0;
			data[0][i]=sc.nextInt();
			data2=data[0][i];
			while(data2>0){
				sum=sum+data2%10;
				data2=data2/10;
			}
			data[1][i]=sum;
		}
		for(int i=0;i<n-1;i++){//data[1][n]先排序(sum)
			for(int j=0;j<n-1;j++){
				if(data[1][j]>data[1][j+1]){
					int tmp;
					tmp=data[0][j];
					data[0][j]=data[0][j+1];
					data[0][j+1]=tmp;
					
					tmp=data[1][j];
					data[1][j]=data[1][j+1];
					data[1][j+1]=tmp;
				}
			}
		}
		for(int i=0;i<n-1;i++){//若(sum)相同   排序
			for(int j=0;j<n-1-i;j++){
				if(data[1][i]==data[1][i+1]){
					if(data[0][i]>data[0][i+1]){
						int tmp;
						tmp=data[0][i];
						data[0][i]=data[0][i+1];
						data[0][i+1]=tmp;
					}
				}
			}
		}
		for(int i=0;i<n;i++){//顯示
			System.out.print(data[0][i]+"\t");
		}
		
		
		
		
	}
	
}

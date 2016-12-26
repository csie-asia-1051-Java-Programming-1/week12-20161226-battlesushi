package ex;
import java.util.Scanner;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 105021030 張廷毓
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data[]=new int[n];
//		String str2=sc.nextLine();//執行若不加這行會少ㄧ次輸入 不知為何
		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			int sum=0;
			for(int j=0;j<str.length();j++)
			sum=sum+(int)str.charAt(j);
			data[i]=sum;
		}
		for(int i=0;i<n;i++){
			System.out.println(data[i]);
		}
		
		
		
	}

}

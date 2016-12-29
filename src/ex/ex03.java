package ex;
import java.util.Scanner;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021030 張廷毓
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				data[i][j]=sc.nextInt();
			}
		}
		//判定是否亂填  0+1  總和為4 或是5
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum=sum+data[i][j];
			}
		}
		if(sum==4||sum==5){
			for(int i=0;i<3;i++){//橫三排
				if(data[i][0]==0&&data[i][1]==0&&data[i][2]==0){//0
					System.out.print("True");
				}
				if(data[i][0]==1&&data[i][1]==1&&data[i][2]==1){//1
					System.out.print("True");
				}
			}
			for(int i=0;i<3;i++){//直三
				if(data[0][i]==0&&data[1][i]==0&&data[2][i]==0){//0
					System.out.print("True");
				}
				if(data[0][i]==1&&data[1][i]==1&&data[2][i]==1){//1
					System.out.print("True");
				}
			}
			//斜排
				if(data[0][0]==0&&data[1][1]==0&&data[2][2]==0){//0
					System.out.print("True");
				}
				if(data[0][0]==1&&data[1][1]==1&&data[2][2]==1){//1
					System.out.print("True");
				}
				if(data[0][2]==0&&data[1][1]==0&&data[2][0]==0){//0
					System.out.print("True");
				}
				if(data[0][2]==1&&data[1][1]==1&&data[2][0]==1){//1
					System.out.print("True");
				}
		}
		else
			System.out.println("False");
		
	}
}
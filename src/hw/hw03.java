package hw;
import java.util.Scanner;
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=str.toLowerCase();
		String data[]=str2.split(" ");
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i].equals(data[j]))
					data[j]="";
			}
		}
		for(int i=0;i<data.length;i++){
			if(i==data.length-1)
				System.out.print(data[i]);
			else
				System.out.print(data[i]+" ");
		}
		
		
		
	}

}

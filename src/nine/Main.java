package nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1009 说反话
		 */
		Scanner input = new Scanner(System.in);
		//先获取一行字符串
		String s = input.nextLine();
		
		
		//这里通过split函数进行字符串的分割
		String[] s1 = s.split(" ");
		for(int i = s1.length-1;i>=0;i--){
			
			System.out.print(s1[i]);
			if(i>0) {
				System.out.print(" ");
			}
		}
		
		

	}

}

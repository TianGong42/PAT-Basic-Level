package two;

import java.util.Scanner;

public class Main {
	//1002 写出这个数
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//先获取这个字符串
		String s = input.next();
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			//将每个字符转换成字符串
			String s1 = String.valueOf(s.charAt(i));
			//然后将每个字符串转换为数字
			sum = sum + Integer.valueOf(s1);
		}
		
		String s1 = String.valueOf(sum);
		
		for(int i = 0;i<s1.length();i++) {
			switch(s1.charAt(i)) {
			case '0':
				System.out.print("ling");
			case '1':
				System.out.print("yi");
				break;
			case '2':
				System.out.print("er");
				break;
			case '3':
				System.out.print("san");
				break;
			case '4':
				System.out.print("si");
				break;
			case '5':
				System.out.print("wu");
				break;
			case '6':
				System.out.print("liu");
				break;
			case '7':
				System.out.print("qi");
				break;
			case '8':
				System.out.print("ba");
				break;
			case '9':
				System.out.print("jiu");
				break;
			}
			if(i<s1.length()-1) {
				
				System.out.print(" ");
			
			}
		}

	}

}

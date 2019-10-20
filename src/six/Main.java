package six;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1006 换个格式输出整数
		 */
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i / 100 != 0) {
			int a = i / 100;
			for(int j = 0;j<a;j++) {
				System.out.print("B");
			}
			i = i % 100;
		}
		if(i / 10 != 0) {
			int a = i / 10;
			for(int j = 0;j<a;j++) {
				System.out.print("S");
			}
			i = i % 10;
		}
		
		for(int j = 1;j<=i;j++) {
			System.out.print(j);
		}
		
		
	}

}

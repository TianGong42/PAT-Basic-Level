package nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1009 ˵����
		 */
		Scanner input = new Scanner(System.in);
		//�Ȼ�ȡһ���ַ���
		String s = input.nextLine();
		
		
		//����ͨ��split���������ַ����ķָ�
		String[] s1 = s.split(" ");
		for(int i = s1.length-1;i>=0;i--){
			
			System.out.print(s1[i]);
			if(i>0) {
				System.out.print(" ");
			}
		}
		
		

	}

}

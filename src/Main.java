import java.util.Scanner;

public class Main {

	/*
	 * 1001 害死人不偿命的(3n+1)猜想
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int n = 0;
		while(i != 1) {
			if(i % 2 == 0) {
				i = i / 2;
				n++;
			}else {
				i = 3 * i + 1;
			}
			
		}
		System.out.println(n);
		
	}

}

package package2;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter input num1");
		int num1 = scanner.nextInt();
		System.out.println("please enter input num2");
		int num2 = scanner.nextInt();
		int div = num1/num2;
		System.out.println("div of two numbers::"+div);
		

	}

}

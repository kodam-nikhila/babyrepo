package package2;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter input num1");
		int num1 = scanner.nextInt();
		System.out.println("please enter input num2");
		int num2 = scanner.nextInt();
		int sum = num1+num2;
		System.out.println("sum of two numbers::"+sum);
		
		}

}

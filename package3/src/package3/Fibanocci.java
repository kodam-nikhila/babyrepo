package package3;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("enter number of numbers you want to print?");
		int count = temp.nextInt();
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1+","+num2+",");
		for(int i=0;i<count-2;i++) {
			int sum = num1+num2;
			System.out.print(sum+",");
			num1 = num2;
			num2 = sum;
					
		}
		System.out.print(".......");
		
		
	}

}

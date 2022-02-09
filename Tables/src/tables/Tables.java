package tables;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number for which you want to print table");
	int num = scanner.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
	}
	

	}

}

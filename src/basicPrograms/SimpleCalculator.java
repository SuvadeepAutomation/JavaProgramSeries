package basicPrograms;

import java.util.Scanner;

//Simple Calculator using switch case

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		char ch = '%';
		double res;

		switch (ch) {
		case '+':
			res = num1 + num2;
			System.out.println("Sum of 2 numbers :" + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println("Substract of 2 numbers :" + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("Multiplication of 2 numbers :" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("Division of 2 numbers :" + res);
			break;
		default:
			System.out.println("No matching operations");
			break;
		}

	}

}

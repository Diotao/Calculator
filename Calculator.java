package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add, subtract, multiply, divide, square, exponentiation?");
		String choice = sc.nextLine();

		if (choice.equals("add")) {
			System.out.println("Choose your two numbers: ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(add(number1, number2));
		}

		else if (choice.equals("subtract")) {
			System.out.println("Choose your two numbers: ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(subtract(number1, number2));
		}

		else if (choice.equals("multiply")) {
			System.out.println("Choose your two numbers: ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(multiply(number1, number2));
		}

		else if (choice.equals("divide")) {
			System.out.println("Choose your two numbers: ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(divide(number1, number2));
		}

		else if (choice.equals("square")) {
			System.out.println("Choose your number: ");
			int number1 = sc.nextInt();
			System.out.println(square(number1));
		}

		else if (choice.equals("exponentiation")) {
			System.out.println("Choose your two numbers: ");
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(exponentiation(number1, number2));
		} else
			System.out.println("Wrong choice");
	}

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int subtract(int number1, int number2) {
		return number1 - number2;
	}

	public static int multiply(int number1, int number2) {
		int answer = 0;
		for (int i = 0; i < number2; i++) {
			answer = number1 + answer;
		}
		return answer;
	}

	public static int divide(int number1, int number2) {

		int answer = 0;

		while (number1 >= number2) {
			number1 = subtract(number1, number2);
			answer++;
		}

		return answer;
	}

	public static int square(int number1) {
		return multiply(number1, number1);
	}

	public static int exponentiation(int number1, int number2) {
		int answer = 1;

		while (number2 > 0) {
			answer = multiply(answer, number1);
			number2--;
		}

		return answer;
	}

}
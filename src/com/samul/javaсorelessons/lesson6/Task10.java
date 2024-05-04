package com.samul.javaсorelessons.lesson6;

import java.util.Scanner;

/*10. Создание простого калькулятора
• Используйте switch для создания калькулятора, выполняющего
базовые операции.
• Темы: switch
*/
public class Task10 {

	public static void main(String[] args) {
		int a, b;
		char oper;
		double res = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Введите выражение для вычисления (с пробелами в формате a + b): ");

		a = in.nextInt();
		oper = in.next().charAt(0);
		b = in.nextInt();

		switch (oper) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			res = (double) a / b;
		}

		System.out.println("1. " + a + " " + oper + " " + b + " = " + res);

		res = switch (oper) {
		case '+' -> a + b;
		case '-' -> a - b;
		case '*' -> a * b;
		default -> (double) a / b;
		};

		System.out.println("2. " + a + " " + oper + " " + b + " = " + res);

	}

}

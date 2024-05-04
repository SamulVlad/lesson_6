package com.samul.javaсorelessons.lesson6;

import java.util.Scanner;

/*9. Вывод дней недели
• Используя switch, выводите название дня недели по введённому
номеру.
• Темы: switch
*/
public class Task9 {

	public static void main(String[] args) {
		int i = 4;
		Scanner in = new Scanner(System.in);
		String day;
		
		System.out.print("Enter the number of day >");
		i = in.nextInt();
		System.out.println();
		
		switch (i) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		default:
			day = "Saturday";
		}

		System.out.println("1.Day = " + day);
		
		day = switch (i) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		default -> "Saturday";
		};
		
		System.out.print("2.Day = " + day);
		
		

	}

}

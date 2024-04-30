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
		
		System.out.print("Day = " + day);
		
		

	}

}

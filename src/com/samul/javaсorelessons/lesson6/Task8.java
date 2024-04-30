package com.samul.javaсorelessons.lesson6;

/*8. Перевод числа из десятичной в двоичную систему
• Используя while, переведите число из десятичной в двоичную систему.
• Темы: while
*/
public class Task8 {

	public static void main(String[] args) {
		int num = 2;
		int rem, i;
		String str = "";
		
		while (num >= 1) {
			rem = num % 2;
			num = num / 2;
			str = str + rem;
		}
		
		i = str.length() - 1;
		
		while (i >= 0) {
			System.out.print(str.charAt(i) + " ");
			i--;
		}
		 
	}

}

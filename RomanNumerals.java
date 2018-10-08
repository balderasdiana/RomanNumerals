/* 
Author: Balderas, Diana
Assignment: Programming Assignment #03
Course: COMP B11 AM
Instructor: Richard Miles
Submitted: 2018/11/09
*/

import java.util.Scanner;

public class RomanNumerals
{
	public static void main(String[] args)
	{
		int number; // A number entered by user and then translated into a roman numeral
		
		Scanner keyboard = new Scanner(System.in); // Create a Scanner object
		
		System.out.println("This will convert numbers from 1 through 10 into a Roman numeral"); // Message to user
		System.out.print("Enter a number within the range of 1 through 10: "); // Prompts user to enter a number 1 through 10
		number = keyboard.nextInt();
		
		if (number == 1)
		{
		    System.out.println("You selected I");
		}
		else if (number == 2)
		{
		    System.out.println("You selected II");
		}
		else if (number == 3)
		{
		    System.out.println("You selected III");
		}
		else if (number == 4)
		{
		    System.out.println("You seleted IV");
		}
		else if (number == 5)
		{
		    System.out.println("You seleted V");
		}
		else if (number == 6)
		{
		    System.out.println("You selected VI");
		}
		else if (number == 7) 
		{
		    System.out.println("You selected VII");
		}
		else if (number == 8)
		{
		    System.out.println("You selected VIII");
		}
		else if (number == 9)
		{
		    System.out.println("You selected IX");
		}
		else if (number == 10)
		{
		    System.out.println("You selected X");
		}
		else if (number < 1 || number > 10)
		{
		    System.out.println("Woah, the number you input is not in the range. Try again!");
		}
	}
} 


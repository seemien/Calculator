	
	/*Problem 2:
	
	 * Write a program to accept two fractions and one operator(+,-,/,or *)
	 * and print out the resulted reduced fraction*/
	/*Precondition:Input two fractions and an operator
	 *Postcodition:Perform the operation and return the reduced fraction */
	import java.util.Scanner;
	
	public class problem2 {
	
		private static Scanner keyboard;
	
		public static void main(String[] args) {
			keyboard = new Scanner(System.in);
			System.out.println("Enter the first numerator,num1:  ");
			int num1 = keyboard.nextInt(); // first numerator
			System.out.println("Enter the second numerator,num2: ");
			int num2 = keyboard.nextInt(); // second numerator
			System.out.println("Enter the first denominator,den1: ");
			int den1 = keyboard.nextInt(); // first denominator
			System.out.println("Enter the second denominator,den2: ");
			int den2 = keyboard.nextInt(); // second denominator
			System.out.println("Enter the Operator : ");
			String operator = keyboard.next(); // input operator
	
			if (num1 == 0 || num2 == 0 || den1 == 0 || den2 == 0) // since we are not allowed zero value for numerators &
																	// denominators
	
			{
				System.out.println("None of the Entries can be zero, Enter a value greater or less than zero");
			} else if (operator.equals("+")) // If the operation is addition
	
			{
				int den = den1 * den2;
				int dennum1 = den2 * num1; // calculates the first numerator of the first fraction
				int dennum2 = den1 * num2; // calculates the first numerator of the second fraction
				int dennumtotal = dennum1 + dennum2; // calculates the total denominator
				int gcd = 1;
				int i = 2;
				while (i <= den && i <= dennumtotal) {
					if (dennumtotal % i == 0 && den % i == 0) {
						gcd = i;
					} // calculates the greatest common denominator
					i++;
				}
				System.out.println("The solution to the equation is: ");
				System.out.println(
						num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + (dennumtotal / gcd) + "/" + (den / gcd));
			} else if (operator.equals("/")) // if the operation is division
			{
				int num1den2 = num1 * den2; // calculates the total numerator
				int den1num2 = den1 * num2; // calculates the total denominator
				int gcd = 1;
				int j = 2;
				while (j <= num1den2 && j <= den1num2) {
					if (num1den2 % j == 0 && den1num2 % j == 0) {
						gcd = j; // calculates greatest common denominator
					}
					j++;
				}
				System.out.println("The solution to the equation is: ");
				System.out.println(
						num1 + "/" + den1 + " / " + num2 + "/" + den2 + " = " + (num1den2 / gcd) + "/" + (den1num2 / gcd));
	
			} else if (operator.equals("*")) // if the operation is multiplication
			{
				int num1num2 = num1 * num2; // calculates the total numerator
				int den1den2 = den1 * den2; // calculates the total denominator
				int j = 2;
				int gcd = 1;
				while (j <= num1num2 && j <= den1den2) {
					if (num1num2 % j == 0 && den1den2 % j == 0) {
						gcd = j; // calculates greatest common denominator
					}
					j++;
				}
				System.out.println("The solution to the equation is: ");
				System.out.println();
				System.out.println(
						num1 + "/" + den1 + " * " + num2 + "/" + den2 + " = " + (num1num2 / gcd) + "/" + (den1den2 / gcd));
			} else if (operator.equals("-")) // if the operation is subtraction
			{
				int den = den1 * den2; // calculates the total denominator
				int dennum1 = den2 * num1; // calculates the first numerator of the first fraction
				int dennum2 = den1 * num2; // calculates the second numerator of the second fraction
				int dennumtotal = dennum1 - dennum2; // calculates the total numerator
				int i = 2;
				int gcd = 1;
				while (i <= dennum1 && i <= dennum2)
	
				{
					if (dennumtotal % i == 0 && den % i == 0) {
						gcd = i;
					} // calculates greatest common denominator
					i++;
				}
				System.out.println("The solution to the equation is: ");
				System.out.println(
						num1 + "/" + den1 + " - " + num2 + "/" + den2 + " = " + (dennumtotal / gcd) + "/" + (den / gcd));
	
			}
		}
	
	}

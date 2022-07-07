package brief1Intoduction;

import java.util.Scanner;

public class BillToPay {

	public static void main(String[] args) {

		String name;
		int choice;
		int numberOfHoursInaMonth;
		int numberOfHoursInaWeek;
		double payment;
		double salary;

		Scanner input = new Scanner(System.in);

		System.out.println("Hey! Please enter your name:");
		name = input.nextLine();
		System.out.println("Hii " + name + ". Welcome With us");

		System.out.println("Please choose :");
		System.out.println("1-Monthly payment.");
		System.out.println("2-Weekly payment.");

		do {

			choice = input.nextInt();

			if (choice == 1 || choice == 2) {
				break;
			} else {
				System.out.println("Please choose 1 or 2 :");
			}
		} while (choice != 1 || choice != 2);

		if (choice == 1) {

			do {

				System.out.println("Enter the number of hours worked per month.<=200");
				numberOfHoursInaMonth = input.nextInt();

			} while (numberOfHoursInaMonth < 0 && numberOfHoursInaMonth >200);

			do {

				System.out.println("Enter the price per hour:>=20DHs");
				payment = input.nextDouble();

			} while (payment < 20);

			if (numberOfHoursInaMonth <= 180) {
				salary = numberOfHoursInaMonth * payment;
			} else {
				salary = 180 * payment + (numberOfHoursInaMonth - 180) * 1.5 * payment;
			}

			System.out.println("Your salary is: " + salary + " Dhs");

		} else {

			do {

				System.out.println("Enter the number of hours worked per week.<=50");
				numberOfHoursInaWeek = input.nextInt();

			} while (numberOfHoursInaWeek < 0 && numberOfHoursInaWeek>50);
			do {

				System.out.println("Enter the price per hour:>=25DHs");
				payment = input.nextDouble();

			} while (payment < 25);

			if (numberOfHoursInaWeek <= 40) {
				salary = numberOfHoursInaWeek * payment;
			} else {
				salary = 40 * payment + (numberOfHoursInaWeek - 40) * 1.5 * payment;
			}

			System.out.println("Your salary is: " + salary + " Dhs");
		}
	}

}

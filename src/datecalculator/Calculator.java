package datecalculator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// user types the first date . I use Scanner to read the date
		System.out.println("Please enter initial date (yyyy-mm-dd): ");
		Scanner Keyboard = new Scanner(System.in);
		String date1 = Keyboard.nextLine();

		// user types the second date
		System.out.println("Please enter final date (yyyy-mm-dd): ");
		Scanner keyboard = new Scanner(System.in);
		String date2 = keyboard.nextLine();

		// here the Class LocalDate will convert the String to a long type, so
		// that
		// it will be possible to make a calculation
		LocalDate d1;
		d1 = LocalDate.parse(date1);
		LocalDate d2;
		d2 = LocalDate.parse(date2);

		System.out.println("Calculating results for " + d1 + " and " + d2);
		// I calculate first the total of days
		// with the Class Math I want to get sure, that even if the result is a
		// negative number the user will read an absolute positive amount of
		// numbers.The second date can be in the past and so it returns a
		// negative number of days
		long daysBetween = ChronoUnit.DAYS.between(d2, d1);
		long positiveDays = Math.abs(daysBetween);
		System.out.println("Days between dates: " + positiveDays);
		// to become months additional to the amount of days, I just use the
		// same Class as for days
		// ChronoUnit is a Class that already exist in java. So I don't need to
		// write my own Class
		long monthBetween = ChronoUnit.MONTHS.between(d2, d1);
		long positiveMonths = Math.abs(monthBetween);
		System.out.println("Months between dates: " + positiveMonths);

		long yearsBetween = ChronoUnit.YEARS.between(d2, d1);
		long positiveYears = Math.abs(yearsBetween);
		System.out.println("Years between dates: " + positiveYears);

	}

}

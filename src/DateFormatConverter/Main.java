package DateFormatConverter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int inputDate;
		int year, month, day;
		boolean ok;
		System.out.println("enter date (yyyymmdd)"); // eg: 19781209
		Scanner sc = new Scanner(System.in);
		inputDate = sc.nextInt();

		day = inputDate%100;
		month = (inputDate/100)%100;
		year = inputDate/10000;
        /*   // test
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        */
       ok = true;
		if (year < 1582 || year > 2100)
		{
			//System.out.println("invalid date");
			ok = false;
		}
		if(ok)
		{
			if((year == 1582 && month == 10) && day < 16)
			{
				ok = false;
				System.out.println("invalid date");
			}
			if (ok)
			{
				if ((year == 2100 && month == 12) && day > 31)
				{
					ok = false;
					System.out.println("invalid date");
				}
			}
			if (ok)
			{
				System.out.println(String.format("%2d.%02d.%4d", day, month, year));
			}
		}
		else
		{
			System.out.println("invalid date");
		}
	}
}

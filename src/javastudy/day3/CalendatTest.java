package javastudy.day3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class CalendatTest {

	public static void main(String[] args) {
		System.out.println("Calendar Test!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		int year = scanner.nextInt();
		System.out.println("월 입력: ");
		int month = scanner.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		int startWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("startWeek:" + startWeek);
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String weekNames[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println( cal.getTime() );
		System.out.println( dayOfMonth );
		
		for (String weekName : weekNames ) {
			System.out.print(weekName + "\t");
		}
		System.out.println();
		
		int step = 0;
		
		for (int i = 1; i <= startWeek - 1; i++) {
			System.out.print("\t");
			step++;
		}
		
		for (int i = 1; i <= dayOfMonth; i++) {
			step++;
			System.out.print(i +"\t");
			if (step % 7 == 0) {
				System.out.println();
			}
		}
	}
}

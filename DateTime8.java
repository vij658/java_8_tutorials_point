package java_8_tutorials_point;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTime8 {
	public static void main(String args[]) {
		DateTime8 java8tester = new DateTime8();
		java8tester.testLocalDateTime();
	}

	public void testLocalDateTime() {

// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1: " + date1);
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		System.out.println("Month: " + month + "day: " + day + "seconds: " + seconds);
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);
//12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date3: " + date3);
//22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);
//parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);

		// test zoned timer

		// Get the current date and time Zone
		System.out.println();
		System.out.println("Get the current date and time Zone: ");
		ZonedDateTime date11 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("zoned date11: " + date11);
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);

		//
		System.out.println();
		System.out.println("Manipulate the date /Get the current date ");

		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);
		// add 1 week to the current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);
		// add 1 m onth to the current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next m onth: " + nextMonth);
		// add 1 year to the current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);
		// add 10 years to the current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Date after ten year: " + nextDecade);

		System.out.println();
		System.out.println("Manipulate the duration/period time/date /Get the current date ");

		// Get the current date
		LocalDate date111 = LocalDate.now();
		System.out.println("Current date: " + date111);

		// add 1 month to the current date
		LocalDate date211 = date1.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + date211);
		Period period = Period.between(date211, date111);
		System.out.println("Period: " + period);

		LocalTime tie1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		LocalTime tie2 = tie1.plus(twoHours);
		Duration duration = Duration.between(tie1, tie2);
		System.out.println("Duration: " + duration);

		// get the "Second
		// Saturday of the Month" or "Next Tuesday""

		System.out.println();
		System.out.println("get the \"Second Saturday of the Month\" or \"Next Tuesday\"\" ");

		// Get the current date
		LocalDate date1111 = LocalDate.now();
		System.out.println("Current date: " + date1111);
		// get the next tuesday
		LocalDate nextTuesday = date1111.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);
		// get the second saturday of next m onth
		LocalDate firstInYear = LocalDate.of(date1111.getYear(), date1111.getMonth(), 1);
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on : " + secondSaturday);

		/*
		 * A toInstant() method is added to the original Date and Calendar objects,
		 * which can be used to convert them to the new Date-Time API. Use an
		 * ofInstant(Insant,ZoneId) method to get a LocalDateTime or ZonedDateTime
		 * object.
		 */

		System.out.println();
		System.out.println("backward compatability ");
		// Get the current date
		Date currentDate = new Date();
		System.out.println("Current date: " + currentDate);
		// Get the instant of current date in term s of milliseconds
		Instant now = currentDate.toInstant();
		ZoneId currentZone1 = ZoneId.systemDefault();
		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone1);
		System.out.println("Local date: " + localDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone1);
		System.out.println("Zoned date: " + zonedDateTime);

	}
}

/*
 * Current DateTime: 2022-05-29T14:57:10.979 j: 2022-05-29 Month: MAYday:
 * 29seconds: 10 date2: 2012-05-10T14:57:10.979 date3: 2014-12-12 date4: 22:15
 * date5: 20:15:30
 * 
 * Get the current date and time Zone: zoned date11:
 * 2007-12-03T10:15:30+05:00[Asia/Karachi] ZoneId: Europe/Paris CurrentZone:
 * America/Chicago
 * 
 * Manipulate the date /Get the current date Current date: 2022-05-29 Next week:
 * 2022-06-05 Next m onth: 2022-06-29 Next year: 2023-05-29 Date after ten year:
 * 2032-05-29
 * 
 * Manipulate the duration/period time/date /Get the current date Current date:
 * 2022-05-29 Next month: 2022-06-29 Period: P-1M
 */
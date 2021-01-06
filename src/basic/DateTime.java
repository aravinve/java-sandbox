package basic;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		LocalDate myLocalDate = LocalDate.now();
		System.out.println(myLocalDate);
		LocalTime myLocalTime = LocalTime.now();
		System.out.println(myLocalTime);
		LocalDateTime myLocalDateTime = LocalDateTime.now();
		System.out.println(myLocalDateTime);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dfs = df.format(myLocalDateTime);
		System.out.println(dfs);
	}
}

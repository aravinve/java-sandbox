package basic;

import java.util.regex.*;

public class Regex {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("secreTkey", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("This si a very secretkey passage in the world!");
		if(matcher.find()) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}

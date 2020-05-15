package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJavaExemplo {

	public static void main(String[] args) {
		
		String text = "<iframe src=\"http://localhost:8080/chubaruba/blablabla/C8221978-D55C-4DB6-BDE3-6C7746F2B27A.PDF\" asdf width=\"100%\" height=\"100%\" style=\"border: none;\"></iframe>";
		
		System.out.println(extractUrlFromTag(text));
		
	}
	
	private static String extractUrlFromTag(String str) {
		String url = null;
		
		String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
		Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
		Matcher urlMatcher = pattern.matcher(str);
		
		while (urlMatcher.find())
		{
		     url = urlMatcher.group();
		}
		
		return url;

	}

}

package com.anditakaesar.simple;
/**
 * StringCount
 * com.anditakaesar.simple.StringCount
 * 
 */
import java.util.regex.*;

public class StringCount {
	/*
	 * parameter: String, 
	 * return: int
	 */
	public static int countString(String str) {
		Pattern splitter = Pattern.compile("( ){1,}|\n|\t");
		String[] word = str.split(splitter.pattern());
		return word.length;
	}
}

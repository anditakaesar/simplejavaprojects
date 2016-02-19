package com.anditakaesar.simple;
/**
 * WordCount
 * com.anditakaesar.simple.WordCount
 * 
 */
import java.util.regex.*;

public class WordCount {
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

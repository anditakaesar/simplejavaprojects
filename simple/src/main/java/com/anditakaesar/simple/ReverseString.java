package com.anditakaesar.simple;

/**
 * ReverseString
 * There are two method in this class
 * that can be used to reverse string
 */

public class ReverseString {

  // algorithm based
  public static String reverse(String str) {
    int length = str.length();
    int i = 0;
    char data[] = new char[length];
    while (length > 0) {
      data[i] = str.charAt(length - 1);
      i++;
      length--;
    }
    return new String(data);
  }

  // using API
  public static String reverseString(String str) {
    StringBuffer sb = new StringBuffer();
    sb.append(str);
    return sb.reverse().toString();
  }
}

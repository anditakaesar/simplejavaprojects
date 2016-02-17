package com.anditakaesar.simple;

/**
 * PalindromeChecker
 *
 */

public class PalindromeChecker {
  public static Boolean isPalindrome(String str) {
    Boolean result = true;
    StringBuffer sb = new StringBuffer();
    sb.append(str);
    // reversed String
    String str_rev = sb.reverse().toString();
    // create array of chars
    char dataO[] = str.toCharArray();
    char dataR[] = str_rev.toCharArray();

    // check each char in dataO and dataR
    for (int i = 0; i < dataO.length; i++) {
      if (dataO[i] != dataR[i]) {
        result = false;
        break;
      }
    }
    return result;
  }
}

package com.anditakaesar.simple;

/**
 * class VowelCount
 * simple vowel counting
 */
public class VowelCount {
  public static int countVowel(String str) {
    int numOfVow = 0;
    char vowels[] = {'a','i','u','e','o'};
    char inputs[] = str.toCharArray();
    for (char c : inputs) {
      for (int i = 0; i < vowels.length; i++) {
        if (c == vowels[i]) {
          numOfVow++;
        }
      }
    }
    return numOfVow;
  }
}

package com.anditakaesar.simple;

import org.junit.*;

public class PalindromeCheckerTest {


  @Test
  public void shouldReturnFalse(){
    Assert.assertEquals(false,PalindromeChecker.isPalindrome("abc"));
  }

  @Test
  public void shouldReturnTrue(){
    Assert.assertEquals(true,PalindromeChecker.isPalindrome("aba"));
  }

  @Test
  public void shouldReturnTrueAgain() {
    Assert.assertEquals(true,PalindromeChecker.isPalindrome("malam"));
  }
}

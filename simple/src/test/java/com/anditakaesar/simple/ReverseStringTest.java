package com.anditakaesar.simple;

import org.junit.*;
import com.anditakaesar.simple.ReverseString;

public class ReverseStringTest {

  @Test
  public void shouldReturnItsReverse() {
    Assert.assertEquals("cba",ReverseString.reverse("abc"));
  }

  @Test
  public void shouldReturnItsReverseUsingAPI() {
    Assert.assertEquals("cba",ReverseString.reverseString("abc"));
  }
}

package com.anditakaesar.simple;

import org.junit.*;
import com.anditakaesar.simple.VowelCount;

public class VowelCountTest {
  @Test
  public void shouldReturnZero() {
    Assert.assertEquals(0,VowelCount.countVowel("bfgdd"));
  }

  @Test
  public void shouldReturnOne() {
    Assert.assertEquals(1, VowelCount.countVowel("abcd"));
  }

  @Test
  public void shouldReturnFive() {
    Assert.assertEquals(5, VowelCount.countVowel("aaaee"));
  }
}

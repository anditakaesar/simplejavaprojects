package com.anditakaesar.simple;

import org.junit.*;
import junit.framework.Assert;

/*
 * WordCountTest
 *
 */
 
public class WordCountTest {
	
	@Test
	public void shouldReturnZero(){
		Assert.assertEquals(0, WordCount.countString(" "));
	}

	@Test
	public void shouldReturnOne() {
		Assert.assertEquals(1, WordCount.countString("this"));
	}
}
package com.anditakaesar.simple;

import org.junit.*;
import junit.framework.Assert;
import com.anditakaesar.simple.StringCount;

/*
 * StringCountTest
 *
 */
 
public class StringCountTest {
	private StringCount counter = new StringCount();
	
	@Test
	public void shouldReturnZero(){
		Assert.assertEquals(0,counter.countString(" "));
	}
}
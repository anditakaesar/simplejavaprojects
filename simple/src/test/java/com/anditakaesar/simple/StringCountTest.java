package com.anditakaesar.simple;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.*;
import junit.framework.Assert;
import com.anditakaesar.simple.StringCount;

/*
 * StringCountTest
 *
 */
 
public class StringCountTest {
	
	@Test
	public void shouldReturnZero(){
		Assert.assertEquals(0,StringCount.countString(" "));
	}

	@Test
	public void shouldReturnOne() {
		Assert.assertEquals(1, StringCount.countString("this"));
	}
}
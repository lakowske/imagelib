package com.informationgain.imagelib.color.converter;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

import com.informationgain.imagelib.color.xyY;

public class sRGBToxyYTest {

	@Test
	public void testConversion() {
		sRGBToxyY converter = new sRGBToxyY();
		xyY a = converter.convert(new Color(1, 1, 1));
		Assert.assertEquals(0.333, a.getx(), 1E-2);
		a = converter.convert(Color.white);
		Assert.assertEquals(0.333, a.getx(), 1E-2);
		a = converter.convert(new Color(250,250,100));
		Assert.assertEquals(0.333, a.getx(), 1E-2);		
	}
}

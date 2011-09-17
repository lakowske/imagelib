package com.informationgain.imagelib.color.converter;

import java.awt.Color;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;

import com.informationgain.imagelib.color.xyY;
import com.informationgain.imagelib.color.impl.xyYImpl;

/**
 * Converts a color from sRGB to xyY.
 * 
 * @author seth
 *
 */
public class sRGBToxyY {

	public xyY convert(Color color) {
		double[][] cieMatrix = {{0.49,.31,0.20},{0.17697,0.81240,0.01063},{0.00,0.01,0.99}};
		double[][] rgb = {{color.getRed()}, {color.getGreen()}, {color.getBlue()}};
		
		Array2DRowRealMatrix M = new Array2DRowRealMatrix(cieMatrix);
		Array2DRowRealMatrix V = new Array2DRowRealMatrix(rgb);
		RealMatrix R = M.multiply(V);
		R.scalarMultiply(1/M.getEntry(1, 0));
		double X = R.getEntry(0, 0);
		double Y = R.getEntry(1, 0);
		double Z = R.getEntry(2, 0);
		
		double x = X / (X + Y + Z);
		double y = Y / (X + Y + Z);
		
		return new xyYImpl(x,y,Y);
	}
	
}

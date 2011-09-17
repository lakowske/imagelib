package com.informationgain.imagelib.color.impl;

import com.informationgain.imagelib.color.xyY;

/**
 * A simple container to hold CIE1931 values.
 * @author seth
 *
 */
public class xyYImpl implements xyY {

	private double x;
	private double y;
	private double Y;
	
	public xyYImpl(double x, double y, double Y) {
		this.x = x;
		this.y = y;
		this.Y = Y;
	}
	
	public double getx() {
		// TODO Auto-generated method stub
		return x;
	}

	public double gety() {
		// TODO Auto-generated method stub
		return y;
	}
	
	public double getY() {
		return Y;
	}


	public void setx(double x) {
		this.x = x;
	}

	public void sety(double y) {
		this.y = y;
	}

	public void setY(double Y) {
		this.Y = Y;
	}
}

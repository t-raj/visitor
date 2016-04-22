package hw4;

import java.util.Iterator;

/**
 * A visitor to compute the number of basic shapes in a (possibly complex)
 * shape.
 */
public class Area implements Visitor<Integer> {

//return the area of a circle
	@Override
	public Integer onCircle(final Circle c) {
		final int radius = c.getRadius();
		double ans = radius*radius*3.14;
		int a = (int)ans;
		return a;
	}


//return the area of a rectangle
	@Override
	public Integer onRectangle(final Rectangle q) {
		final int width = q.getWidth();
		final int height = q.getHeight();
		return width*height;
	}


}

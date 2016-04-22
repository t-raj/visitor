package hw4;

import java.util.Iterator;
import java.util.List;

/**
 * A shape visitor for calculating the bounding box, that is, the smallest
 * rectangle containing the shape. The resulting bounding box is returned as a
 * rectangle at a specific location.
 */
public class Perimeter implements Visitor<Integer> {


//return the perimeter of a circle
	@Override
	public Integer onCircle(final Circle c) {
		final int radius = c.getRadius();
		double ans = radius*2*3.14;
		int a = (int)ans;
		return a;
	}


//return the perimeter of a rectangle
	@Override
	public Integer onRectangle(final Rectangle q) {
		final int width = q.getWidth();
		final int height = q.getHeight();
		return (width+height)*2;
	}

}

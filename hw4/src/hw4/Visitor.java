package hw4;

/**
 * A visitor on edu.luc.etl.cs313.android.shapes.model. Instances represent functions from Shape to
 * a generic result type.
 */
public interface Visitor<Result> {
	Result onCircle(Circle c);
	Result onRectangle(Rectangle r);
}

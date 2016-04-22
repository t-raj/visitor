package hw4;

/**
 * A graphical shape.
 */
public interface Shape {
	<Result> Result accept(Visitor<Result> v);
}

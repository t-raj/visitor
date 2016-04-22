package hw4;

//test cases: create a rectangle and circle and output their perimeter and area

public class test {
	public static void main(String[] args){
		Rectangle r = new Rectangle(2,3);
		Circle c = new Circle(4);
		Perimeter p = new Perimeter();
		Area a = new Area();
		r.accept(p);
		r.accept(a);
		c.accept(p);
		c.accept(a);
		int rp = p.onRectangle(r);
		int ra = a.onRectangle(r);
		int cp = p.onCircle(c);
		int ca = a.onCircle(c);
		System.out.println("Rectangle name: r perimeter: " + rp + " area: " + ra);
		System.out.println("Circle name: c perimeter: " + cp + " area: " + ca);
	}
}

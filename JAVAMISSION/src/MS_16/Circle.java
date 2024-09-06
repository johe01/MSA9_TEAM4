package MS_16;
//Circle
public class Circle extends Shape {

	double radius;

	public Circle() {
		this(0.0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return radius * radius * Math.PI;
	}

	@Override
	double round() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

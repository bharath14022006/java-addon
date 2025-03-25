package shapes;

public class Square extends Shape {

	double side;

	public Square() {
		shapeType = "Square";
	}

	@Override
	public void getInput() {
		getShapeID();
		ps.print("enter the side lenght:");
		side = in.nextDouble();
		CalculateArea();

	}

	@Override
	public void CalculateArea() {
		SurfaceArea = side * side;
		ps.println(SurfaceArea);
	}

	@Override
	public String toString() {

		return null;
	}

	@Override
	public String toCSVSString() {

		return null;
	}

}

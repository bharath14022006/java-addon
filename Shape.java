package shapes;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Shape {
	protected PrintStream ps = System.out;
	protected Scanner in = new Scanner(System.in);

	protected String shapeType;
	protected String shapeID;
	protected double SurfaceArea;

	abstract public void getInput();

	abstract public void CalculateArea();

	abstract public String toString();

	abstract public String toCSVSString();

	public Shape() {
		shapeID = "undifined";
	}

	public Shape(String shapeType, String shapeID) {
		this.shapeType = shapeType;
		this.shapeID = shapeID;
	}

	protected void getShapeID() {
		ps.print("Enter shapeID");
		shapeID = in.nextLine();

	}
}
public interface Shape1 {                        // interface declaration
    double area ();
}


class Rectangle implements Shape1 {

    Rectangle (double side1, double side2) {
	this.side1 = side1;
	this.side2 = side2;
    }

    private double side1;        // length of one side
    private double side2;        // length of the other side

    public double area () {
	return side1 * side2;
    }

}


class Triangle extends Rectangle implements Shape1 {

    Triangle (double altitude, double base) {
	super (altitude, base);
    }

    public double area () {
	return 0.5 * super.area();
    }

}





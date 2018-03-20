/**
 * 
 */

/**
 * @author vandana
 *
 */


	public class Shape
	{ public static void main(String[] args)
	{ Square jack = new Square("Trafalgar", 2d);
	Circle jill = new Circle("Arctic", 1.5d);
	System.out.printf("Shape jack%n%s%n", jack);
	System.out.printf("Shape jill%n%s%n", jill);
	}
	}
	abstract class ShapeA
	{ private String name;
	public ShapeA(String s)
	{ setName(s);
	}
	public String getName()
	{ return this.name;
	}
	public void setName(String s)
	{ this.name = s;
	}
	public abstract double perimeter(); // note abstract and the semi-colon
	public abstract double area(); // note abstract and the semi-colon
	}
	class Square extends ShapeA
	{ private double side;
	public Square(String s, double side)
	{ super(s);
	this.side = side;
	}
	public double perimeter() // no abstract
	{ return 4d*this.side;
	}
	public double area() // no abstract
	{ return this.side*this.side;
	}
	public String toString()
	{ return String.format(" Square - %s%n" +
	" Side is %.2f%n" +
	" Perimeter is %.2f%n" +
	" Area is %.2f%n",
	this.getName(), this.side, this.perimeter(), this.area());
	}
	}
	class Circle extends ShapeA
	{ private double radius;
	public Circle(String s, double radius)
	{ super(s);
	this.radius = radius;
	}
	public double perimeter() // no abstract
	{ return 2d*Math.PI*this.radius;
	}
	public double area() // no abstract
	{ return Math.PI*this.radius*this.radius;
	}
	public String toString()
	{ return String.format(" Circle - %s%n" +
	" Radius is %.2f%n" +
	" Circumference is %.2f%n" +
	" Area is %.2f%n",
	this.getName(), this.radius, this.perimeter(), this.area());
			
	}
	}
			
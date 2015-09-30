
public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double perimeter; 
	private double area;
	
	public Triangle (){
		
	}
	/**
	 * 
	 * Instantiates a triangle 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	/**
	 * Gets the length of side1
	 * @return
	 */
	
	public double getSide1() {
		return side1;
	}
	
	/**
	 * Gets the length of side2
	 * @return
	 */

	public double getSide2() {
		return side2;
	}
	
	/**
	 * Gets the length of side3
	 * @return
	 */

	public double getSide3() {
		return side3;
	}
	
	/**
	 * 
	 * Calculates the area of a triangle  
	 */

	@Override
	public double getArea() {
		area = (side1 + side2 + side3)/2;
		return area;
	}
	
	/**
	 * 
	 * Calculates the perimeter of a triangle
	 */

	@Override
	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	/**
	 * 
	 * Returns a string with a description of the characteristics of the triangle
	 */
	
	public String toString() {
		return "This triangle has an area of " + area + "and a perimeter of " + perimeter;
	}

}

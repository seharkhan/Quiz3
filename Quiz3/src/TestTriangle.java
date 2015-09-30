import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	@Test
	public void testGetArea(){
		Triangle tri = new Triangle();
		double expected = 1.5;
		double result = tri.getArea();
		
		assertEquals(expected, result, 0.00001);
	}
	
	@Test 
	public void testGetPerimeter(){
		Triangle tri = new Triangle ();
		double expected = 3.0;
		double result = tri.getPerimeter();
		
		assertEquals(expected, result, 0.00001);
	}
	


}

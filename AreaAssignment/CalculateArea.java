package AreaAssignment;

class CalculateArea {
	
	/**
	 * Calculate the area of triangle
	 * 
	 * @param width The input parameter of the triangle
	 * @param height The input parameter of the triangle
	 * @return area of triangle (double)
	 * @throws ArithmeticException If there's a division by zero error during triangle area calculation
	 */
	double calculateTriangleArea(double width, double height) throws ArithmeticException {
		if(width <= 0 || height <= 0) {
			throw new ArithmeticException("Number Should be Greater than Zero");
		}
		double area = (width*height)/2;
		return area;
	}
	
	/**
	 * Calculate the area of rectangle
	 * 
	 * @param length The input parameter of the rectangle
	 * @param breadth The input parameter of the rectangle
	 * @return area of rectangle (double)
	 * @throws ArithmeticException If there's a division by zero error during rectangle area calculation
	 */
	double calculateRectangleArea(double length, double breadth) throws ArithmeticException {
		if(length <= 0 || breadth <= 0) {
			throw new ArithmeticException("Number Should be Greater than Zero");
		}
		double area = length*breadth;
		return area;
	}
	
	/**
	 * Calculates the area of square
	 * 
	 * @param side The input parameter of the square
	 * @return area of square (double)
	 * @throws ArithmeticException If there's a division by zero error during square area calculation
	 */
	double calculateSquareArea(double side) throws ArithmeticException {
		if(side <= 0 ) {
			throw new ArithmeticException("Number Should be Greater than Zero");
		}
		double area = side*side;
		return area;
	}
	
	/**
	 * Calculate the area of circle
	 * 
	 * @param radius The input parameter of the circle
	 * @return area of circle (double)
	 * @throws ArithmeticException If there's a division by zero error during circle area calculation
	 */
	double calculateCircleArea(double radius) throws ArithmeticException {
		if(radius <= 0 ) {
			throw new ArithmeticException("Number Should be Greater than Zero");
		}
		double area = (22*radius*radius)/7;
		return area;
	}
}

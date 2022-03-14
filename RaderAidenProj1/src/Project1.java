/* Name: Aiden Rader
 * Date: 2-15-22
 * Instructor: Dr.Hobbs
 * Class: EECS 1500
 * Title of Assignment: Project 1
  */

import java.util.Scanner;

public class Project1 // name of class (Project1)
{
	public static void main(String[] args) // Main Method
	{
		Scanner input = new Scanner(System.in);
		int b = 1;
		while (b == 1) // User wants to continue with a new function, that would be "b"
		{
			int a = input.nextInt();
			if (a == 1) // Function #1: Check if Triangle is valid
				System.out.println(isValidTriangle(input.nextDouble(), input.nextDouble(), input.nextDouble()));
			// Output: Triangle is valid. Should output 'false' if invalid.

			else if (a == 2) // Function #2: Area of a triangle.
				System.out.println(areaTriangle(input.nextDouble(), input.nextDouble(), input.nextDouble()));
			// Output: Area of the triangle.

			else if (a == 3) // Function #3: Perimeter of a triangle
				System.out.println(perimeterTriangle(input.nextDouble(), input.nextDouble(), input.nextDouble()));
			// Output: Perimeter of the triangle.

			else if (a == 4) // Function #4: Area of a pentagon.
				System.out.println(areaPentagon(input.nextDouble()));
			// Output: Area of the pentagon

			else if (a == 5) // Function #5: Perimeter of a pentagon.
				System.out.println(perimeterPentagon(input.nextDouble()));
			// Output: Perimeter of the pentagon.

			else if (a == 6) // Function #6: Area of a regular polygon.
				System.out.println(areaPolygon(input.nextInt(), input.nextDouble()));
			// Output: Area of the regular polygon.

			else if (a == 7) // Function #7: Point position in relation to line.
				whereIsP2(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(),
						input.nextDouble(), input.nextDouble());
			// Output: Point is to the left of the line.
			// Output: Point is on the line segement.
			// Output: Point is on the line (but not the segment).
			// Output: Point is to the right of the line.

			else if (a == 8) // Function #8: Area of a circle.
				System.out.println(areaCircle(input.nextDouble()));
			// Output: Area of the circle.

			else if (a == 9) // Function #9: Circumference of a circle
				System.out.println(circumferenceCircle(input.nextDouble()));
			// Output: Area of the circle.

			else
				System.out.println("N/A"); // Error in inputs
			b = input.nextInt(); // User is done and wants to stop program execution.
		}
		input.close(); // Close java scanner(input)
	}

	// Function #1: Check if triangle if valid

	public static boolean isValidTriangle(double s1, double s2, double s3)
	{
		boolean trueFalse;
		if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) // Equation to find if the triangle is valid
			trueFalse = true;
		else
			trueFalse = false;
		return trueFalse;
	}

// Function #2: Area of a triangle.

	public static double areaTriangle(double side1, double side2, double side3)
	{
		double areaTri;
		double e = (side1 + side2 + side3) / 2.0;
		areaTri = Math.sqrt(e * (e - side1) * (e - side2) * (e - side3)); // Equation to find area of the triangle
		return areaTri;
	}

	// Function #3: Perimeter of a triangle.

	public static double perimeterTriangle(double s1, double s2, double s3)
	{
		return s1 + s2 + s3; // Equation to find perimeter of the triangle
	}

	// Function #4: Area of a pentagon.

	public static double areaPentagon(double a)
	{
		// Math for area of pentagon A=1/4√5(5+2√5)a^2
		return (5 * Math.pow(a, 2)) / (4 * Math.tan(Math.PI / 5)); // Equation to find to area of pentagon
	}

	// Function #5: Perimeter of a pentagon.

	public static double perimeterPentagon(double side)
	{
		return (5 * side); // Equation to find the perimeter of the pentagon
	}

	// Function #6: Area of a regular polygon.

	public static double areaPolygon(int n, double side)
	{
		return (n * (side * side)) / (4.0 * Math.tan((Math.PI / n))); // Equation to find area of a polygon
	}

	// Method call for all of Function #7

	public static void whereIsP2(double x0, double y0, double x1, double y1, double x2, double y2)
	{
		// Method to calculate the point
		double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0); // Equation to find which side the point is on or if
																	// its on or segmented on the line

		if ((y1 - y0) / (x1 - x0) == (y2 - y0) / (x2 - x0) && (x0 < x2) && (x2 < x1))
			System.out.println("segment");

		else if ((y1 - y0) / (x1 - x0) == (y2 - y0) / (x2 - x0))
			System.out.println("on");

		else if (d < 0)
			System.out.println("right");

		else
			System.out.println("left");
	}

	// Function #8: Area of a circle

	public static double areaCircle(double radius)
	{
		double radi = ((radius) * (radius) * Math.PI); // Equation to find area of a circle
		return radi;
	}

	// Function #9: Circumference of a circle.

	public static double circumferenceCircle(double radius)
	{
		double circ = ((2) * Math.PI * (radius)); // Equation to find circumference of a circle
		return circ;
	}

} // Class closing bracket

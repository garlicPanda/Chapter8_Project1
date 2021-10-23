
/**
 * Write a class that has three overloaded static methods for calculating the areas of the
following geometric shapes:
- circles
- rectangles
- cylinders
	Here are the formulas for calculating the area of the shapes.
	Area of a circle: Area = π r2, where p is Math.PI and r is the circle's radius
	Area of a rectangle: Area = Width x Length
	Area of a cylinder: Area = π r2 h, where p is Math.PI, r is the radius of the cylinder's base, and h is the cylinder's height
	Because the three methods are to be overloaded, they should each have the same name, but different parameter lists. Demonstrate the class in a complete program.

 * @author vanessa
 *
 */
import java.util.Scanner;
		public class Area {
	 public static double getArea(double radius) {
		        return (Math.PI * (radius * radius));
	   }
	  public static double getArea(double length, double width) {
	        return (length * width);
		    }
		
		    public static double getArea(float radius, float height) {
		        return (Math.PI * (radius * radius) * height);
		    }
		
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.printf("=== Area Calculator ===%n%n"
		                + "Enter radius to calculate circle area: ");
		        double circRadius = input.nextDouble();
		        System.out.printf("Enter width to calculate"
		                + " rectangle area: ");
		        double recWidth = input.nextDouble();
		        System.out.printf("Enter length to calculate"
		                + " rectangle area: ");
		        double recLength = input.nextDouble();
		        System.out.printf("Enter base radius to calculate"
		                + " cylinder area: ");
	        float cylRadius = input.nextFloat();
		        System.out.printf("Enter height to calculate"
		                + " cylinder area: ");
		        float cylHeight = input.nextFloat();
		        System.out.printf("%n--------%nResults:%n--------%n%n"
		                + "The area of the circle is: %.2f%n"
		                + "The area of the rectangle is: %.2f%n"
		                + "The area of the cylinder is: %.2f%n",
		                Area.getArea(circRadius),
		                Area.getArea(recWidth, recLength),
		                Area.getArea(cylRadius, cylHeight));
		        return;
		    }
		
		}




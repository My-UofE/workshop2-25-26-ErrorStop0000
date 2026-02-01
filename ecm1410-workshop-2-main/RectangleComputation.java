// Print the area and circumference of a circle, given its radius
public class RectangleComputation {
    public static void main(String[] args) {
        // Declare 3 variables of double type.
        double width, height, perimeter, area;
        // Use "final" to specify that its value cannot be changed (i.e. constant).
        // Assign a value to radius.
        width = 1.5;
		height = 1.5;
		double ratio = width / height;
		boolean isSquare = (ratio == 1.0);
        // Compute area and circumference
        area = width * height; // could also use Math.pow(radius,2) * PI
        perimeter = 2.0 * (width + height);

        System.out.println("The perimeter is " + perimeter);       
        System.out.println("The area is " + area);
        System.out.println("Width to height ratio " + ratio);
		if (isSquare) {
			System.out.println("Square");
		} else {
			System.out.println("Not");
		}
    }
}
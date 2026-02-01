// Print the area and circumference of a circle, given its radius
public class CircleComputation {
    public static void main(String[] args) {
        // Declare 3 variables of double type.
        double radius, area, circumference;
        // Use "final" to specify that its value cannot be changed (i.e. constant).
        final double PI = 3.14159265;    // later you will see we can use Math.PI instead
        // Assign a value to radius.
        radius = 1.5;
        // Compute area and circumference
        area = radius * radius * PI; // could also use Math.pow(radius,2) * PI
        circumference = 2.0 * PI * radius;

        System.out.println("The radius is " + radius);       
        System.out.println("The area is " + area);
        System.out.println("The circumference is " + circumference);
    }
}
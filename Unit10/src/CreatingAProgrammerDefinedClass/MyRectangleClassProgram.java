package CreatingAProgrammerDefinedClass;

// This program uses the programmer-defined Rectangle class.

public class MyRectangleClassProgram
{
    public static void main(String args[])
    {
        // Create rectangle1 and rectangle2 objects here.
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        // Set the length of rectangle1 to 10.0 here.
        rectangle1.setLength(10.0);
        // Set the width of rectangle1 to 5.0 here.
        rectangle1.setWidth(5.0);

        // Print the area and perimeter of rectangle1 here.
        System.out.println("Rectangle 1's perimeter is: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle 1's area is: " + rectangle1.calculateArea());

        // Set the length of rectangle2 to 7.0 here.
        rectangle2.setLength(7.0);
        // Set the width of rectangle2 to 3.0 here.
        rectangle2.setWidth(3.0);

        // Print the area and perimeter of rectangle2 here.
        System.out.println("Rectangle 2's perimeter is: " + rectangle2.calculatePerimeter());
        System.out.println("Rectangle 2's area is: " + rectangle2.calculateArea());

        System.exit(0);
    }
}
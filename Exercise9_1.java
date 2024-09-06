public class Exercise9_1 {
  public static void main(String[] args) {

    // Create the Rectangle object class.
    class Rectangle {
      
      // Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
      double width = 1;
      double height = 1;

      // A no-arg constructor that creates a default rectangle.
      Rectangle() {
      }

      // A constructor that creates a rectangle with the specified width and height.
      Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
      }

      // A method named getArea() that returns the area of this rectangle.
      double getArea() {
        return width * height;
      }
      // A method named getPerimeter() that returns the perimeter.
      double getPerimeter() {
        return width * 2 + width * 2;
      }
    }
    
    // Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9.
    Rectangle rect1 = new Rectangle(4, 40);
    Rectangle rect2 = new Rectangle(3.5, 35.9);

    // Display the width, height, area, and perimeter of each rectangle in this order.
    System.out.println("Rectangle 1:");
    System.out.println("Width: " + rect1.width);
    System.out.println("Height: " + rect1.height);
    System.out.println("Area: " + rect1.getArea());
    System.out.println("Perimeter: " + rect1.getPerimeter());

    System.out.println();

    System.out.println("Rectangle 2:");
    System.out.println("Width: " + rect2.width);
    System.out.println("Height: " + rect2.height);
    System.out.println("Area: " + rect2.getArea());
    System.out.println("Perimeter: " + rect2.getPerimeter());
  }
}
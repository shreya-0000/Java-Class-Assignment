// Abstract class
abstract class Shape {
    abstract void draw();  // abstract method
}

// Subclass that implements the abstract method
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Main class
public class Shape {
    public static void main(String[] args) {
        Shape s = new Circle();  // abstraction in action
        s.draw();                // Output: Drawing a circle
    }
}

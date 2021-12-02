package exercise8;

public class Point {
    // Define attributes

    public Point() {
        // Initialize attributes to 0
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
    }

    public void initialize() {
        // Change attributes through console
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        return null;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return null;
    }
}

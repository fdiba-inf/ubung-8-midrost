package exercise8;

import java.io.PipedOutputStream;

public class Point {
    // Define attributes
    double x;
    double y;

    public Point() {
        // Initialize attributes to 0
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        this.x = Utils.INPUT.nextDouble();
        this.y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        this.x += xDelta;
        this.y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        Point newPoint = new Point(this.x, this.y);
        newPoint.translate(xDelta, yDelta);
        return newPoint;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        return Utils.equals(this.x, otherPoint.x) && Utils.equals(this.y, otherPoint.y);
    }

    public String toString() {
        // Represent attributes as string
        return "(" + this.x + ", " + this.y + ")";
    }
}

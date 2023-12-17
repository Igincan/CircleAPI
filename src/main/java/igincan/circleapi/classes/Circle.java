package igincan.circleapi.classes;

public class Circle {

    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean is_inside(Point point) {
        return this.center.calculateDistance(point) <= this.radius;
    }

}

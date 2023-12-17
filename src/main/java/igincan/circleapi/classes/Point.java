package igincan.circleapi.classes;

public record Point(double x, double y) {

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

}

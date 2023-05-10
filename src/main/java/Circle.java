
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle() {
        this.radius = 0;
    }

    public void setRadius(double rad) {
        this.radius = rad;

    }

    public double getRadius() {
        return this.radius;
    }

    public double computeArea() {
        return radius * radius * Math.PI;

    }
}

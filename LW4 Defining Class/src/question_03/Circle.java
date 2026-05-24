package question_03;

public class Circle {

    private double radius;

    // Constructor
    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

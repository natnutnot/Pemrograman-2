public class Sphere extends Shape {
    private double radius; // radius in feet

    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * (radius*radius);
    }

    @Override
    public String toString() {
        return super.toString() + "of radius" + radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void updateRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }
}

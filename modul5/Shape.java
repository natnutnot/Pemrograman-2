public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    protected abstract double area();

    @Override
    public String toString() {
        return this.shapeName;
    }
}
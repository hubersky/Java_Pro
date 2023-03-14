package home_works.home_work4.first_task;

public class Circle implements Geometric {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float findFigureArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}

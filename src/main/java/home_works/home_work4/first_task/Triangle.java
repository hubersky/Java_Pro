package home_works.home_work4.first_task;

public class Triangle implements Geometric {
    float lengthOfSide;
    float lengthOfHeight;

    public Triangle(float lengthOfSide, float lengthOfHeight) {
        this.lengthOfSide = lengthOfSide;
        this.lengthOfHeight = lengthOfHeight;
    }

    @Override
    public float findFigureArea() {
        return lengthOfSide * lengthOfHeight / 2;
    }
}

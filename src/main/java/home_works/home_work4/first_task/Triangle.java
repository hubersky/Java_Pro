package home_works.home_work4.first_task;

public class Triangle implements Geometric {

    private float lengthOfSide;
    private float lengthOfHeight;

    public Triangle(float lengthOfSide, float lengthOfHeight) {
        this.lengthOfSide = lengthOfSide;
        this.lengthOfHeight = lengthOfHeight;
    }

    @Override
    public float findFigureArea() {
        return lengthOfSide * lengthOfHeight / 2;
    }

    public float getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(float lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public float getLengthOfHeight() {
        return lengthOfHeight;
    }

    public void setLengthOfHeight(float lengthOfHeight) {
        this.lengthOfHeight = lengthOfHeight;
    }
}

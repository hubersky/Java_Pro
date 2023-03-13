package home_works.home_work4.first_task;

public class Square implements Geometric {
    float lengthOfSide;

    public Square(float lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public float findFigureArea() {
        return (float) Math.pow(lengthOfSide, 2);
    }
}

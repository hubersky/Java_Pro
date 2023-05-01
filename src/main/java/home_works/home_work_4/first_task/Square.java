package home_works.home_work_4.first_task;

public class Square implements Geometric {

    private float lengthOfSide;

    public Square(float lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public float findFigureArea() {
        return (float) Math.pow(lengthOfSide, 2);
    }

    public float getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(float lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }
}

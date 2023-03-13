package home_works.home_work4.first_task;

public class Main {
    public static void main(String[] args) {
        Geometric circle = new Circle(7);
        Geometric triangle = new Triangle(2, 3);
        Geometric square = new Square(2);
        Geometric[] geometricShape = {circle, triangle, square};
        sumArea(geometricShape);
    }

    public static void sumArea(Geometric[] arr) {
        float result = 0;
        for (Geometric g : arr) {
            result += g.findFigureArea();
        }
        System.out.println("Total area of all figures = " + result);
    }
}

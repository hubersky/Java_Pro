package home_works.home_work4.second_task;

public class Cat extends Participant {

    public Cat(int rangeOfRun, int rangeOfJump) {
        super(rangeOfRun, rangeOfJump);
    }

    @Override
    public void run() {
        System.out.print("Cat runs");
    }

    @Override
    public void jump() {
        System.out.print("Cat jumps");
    }
}

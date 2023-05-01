package home_works.home_work_4.second_task;

public class Human extends Participant {

    public Human(int rangeOfRun, int rangeOfJump) {
        super(rangeOfRun, rangeOfJump);
    }

    @Override
    public void run() {
        System.out.print("Human runs");
    }

    @Override
    public void jump() {
        System.out.print("Human jumps");
    }
}

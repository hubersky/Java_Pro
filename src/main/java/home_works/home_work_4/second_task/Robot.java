package home_works.home_work_4.second_task;

public class Robot extends Participant {

    public Robot(int rangeOfRun, int rangeOfJump) {
        super(rangeOfRun, rangeOfJump);
    }

    @Override
    public void run() {
        System.out.print("Robot runs");
    }

    @Override
    public void jump() {
        System.out.print("Robot jumps");
    }
}

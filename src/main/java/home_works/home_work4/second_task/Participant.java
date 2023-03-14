package home_works.home_work4.second_task;

public abstract class Participant {
    private int rangeOfRun;
    private int rangeOfJump;

    public Participant(int rangeOfRun, int rangeOfJump) {
        this.rangeOfRun = rangeOfRun;
        this.rangeOfJump = rangeOfJump;
    }

    public abstract void run();

    public abstract void jump();

    public int getRangeOfRun() {
        return rangeOfRun;
    }

    public void setRangeOfRun(int rangeOfRun) {
        this.rangeOfRun = rangeOfRun;
    }

    public int getRangeOfJump() {
        return rangeOfJump;
    }

    public void setRangeOfJump(int rangeOfJump) {
        this.rangeOfJump = rangeOfJump;
    }
}

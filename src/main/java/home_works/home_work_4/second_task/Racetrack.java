package home_works.home_work_4.second_task;

public class Racetrack extends Barrier {
    private int trackLength;

    public Racetrack(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public int overcome() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }
}

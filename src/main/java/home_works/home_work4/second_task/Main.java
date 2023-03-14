package home_works.home_work4.second_task;

public class Main {
    public static void main(String[] args) {
        Participant human = new Human(100, 2);
        Participant cat = new Cat(200, 5);
        Participant robot = new Robot(250, 1);

        Barrier racetrack = new Racetrack((int) (Math.random() * 300));
        Barrier wall = new Wall((int) (Math.random() * 5));

        Participant[] participants = {human, cat, robot};
        Barrier[] barriers = {racetrack, wall};
        tournament(participants, barriers);
    }

    public static void tournament(Participant[] participants, Barrier[] barriers) {
        for (Participant participant : participants) {
            for (Barrier barrier : barriers) {
                if (barrier.toString().contains("Racetrack")) {
                    if (participant.getRangeOfRun() >= barrier.overcome()) {
                        participant.run();
                        System.out.println(" and pass the obstacle of racetrack!");
                    } else {
                        participant.run();
                        System.out.println(" and doesn't pass the obstacle of racetrack!");
                        System.out.println("The passed distance: " + participant.getRangeOfRun() + " out of " + barrier.overcome() + "\n");
                        break;
                    }
                } else {
                    if (participant.getRangeOfJump() >= barrier.overcome()) {
                        participant.jump();
                        System.out.println(" and pass the obstacle of wall!");
                    } else {
                        participant.jump();
                        System.out.println(" and doesn't pass the obstacle of wall!");
                        System.out.println("The passed height: " + participant.getRangeOfJump() + " out of " + barrier.overcome() + "\n");
                        break;
                    }
                    System.out.println();
                }
            }
        }
    }
}

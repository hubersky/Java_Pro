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
        for (Participant p : participants) {
            for (Barrier b : barriers) {
                if (b.toString().contains("Racetrack")) {
                    if (p.getRangeOfRun() >= b.overcome()) {
                        p.run();
                        System.out.println(" and pass the obstacle of racetrack!");
                    } else {
                        p.run();
                        System.out.println(" and doesn't pass the obstacle of racetrack!");
                        System.out.println("The passed distance: " + p.getRangeOfRun() + " out of " + b.overcome() + "\n");
                        break;
                    }
                } else {
                    if (p.getRangeOfJump() >= b.overcome()) {
                        p.jump();
                        System.out.println(" and pass the obstacle of wall!");
                    } else {
                        p.jump();
                        System.out.println(" and doesn't pass the obstacle of wall!");
                        System.out.println("The passed height: " + p.getRangeOfJump() + " out of " + b.overcome() + "\n");
                        break;
                    }
                    System.out.println();
                }
            }
        }
    }
}

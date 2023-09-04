package homeWork_2;

public class Treadmill extends Discipline {

    public Treadmill(int distance) {
        super(distance);
    }

    public void overcome(Participant participant) {
        if (!participant.isDisqualified()) {
            participant.run(distance);
        }
    }
}

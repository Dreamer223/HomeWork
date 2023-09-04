package homeWork_2;
public class Wall extends Discipline{

    public Wall(int distance) {
        super(distance);
    }

    public void overcome(Participant participant) {
        if (!participant.isDisqualified()) {
            participant.jump(distance);
        }
    }
}

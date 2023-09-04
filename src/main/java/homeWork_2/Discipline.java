package homeWork_2;

public abstract class Discipline {
    int distance;

    public Discipline(int distance) {
        this.distance = distance;
    }
    public abstract void overcome(Participant participant);
}

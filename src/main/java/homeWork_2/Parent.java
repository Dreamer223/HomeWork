package homeWork_2;

public class Parent {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean disqualified;

    public Parent(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.disqualified = false;
    }
}

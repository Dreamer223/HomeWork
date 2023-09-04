package homeWork_2;

public class Cat extends Parent implements Participant {
    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    public void run(int distance) {
        if (!disqualified) {
            if (distance <= maxRunDistance) {
                System.out.println(name + " успешно пробежал " + distance + " м.");
            } else {
                System.out.println(name + " не смог пробежать " + distance + " м. и выбывает.");
                disqualified = true;
            }
        }
    }

    @Override
    public void jump(int height) {
        if (!disqualified) {
            if (height <= maxJumpHeight) {
                System.out.println(name + " успешно перепрыгнул стену высотой " + height + " м.");
            } else {
                System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " м. и выбывает.");
                disqualified = true;
            }
        }
    }

    @Override
    public boolean isDisqualified() {
        if (disqualified)
        {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

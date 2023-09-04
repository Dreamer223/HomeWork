package homeWork_2;

import java.util.*;
import java.util.List;

//1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса
// но есть общий класс родитель. Эти классы должны уметь бегать и прыгать, все также с
// выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
// должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
// печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
// (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
// этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
// списку он препятствий не идет.
public class Main {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>(Arrays.asList(
                new Robot("robot1", 1000, 1),
                new Cat("cat1", 300, 3),
                new Human("human1", 500, 3),
                new Robot("robot2", 1500, 2),
                new Cat("cat2", 350, 7),
                new Human("human2", 800, 2),
                new Robot("robot3", 400, 3),
                new Cat("cat3", 400, 1),
                new Human("human3", 250, 5),
                new Robot("robot4", 700, 6),
                new Cat("cat4", 200, 2),
                new Human("human4", 300, 4),
                new Robot("robot5", 200, 10),
                new Cat("cat5", 500, 5))
        );
        List<Participant> winner = new ArrayList<>();

        Discipline[] obstacles = {new Treadmill(200),
                new Wall(1),
                new Treadmill(10),
                new Treadmill(40),
                new Treadmill(30),
                new Treadmill(60),
                new Wall(2),
                new Wall(4),
                new Wall(5)};
        for (Participant participant : participants) {
            boolean disqualified = false;
            System.out.println("Начинает участник по номером: " + participant.getName());
            for (Discipline obstacle : obstacles) {
                if (disqualified) {

                    break;
                }
                obstacle.overcome(participant);
                disqualified = participant.isDisqualified();
            }
            if (!disqualified) {
                System.out.println(participant.getName() + " участник успешно прошел полосу препятствий!");
                winner.add(participant);
            } else {
                System.out.println(participant.getName() + " участник выбыл из соревнования.");
            }
        }
        for (Participant win : winner){
            System.out.println(win.getName());
        }
    }
}


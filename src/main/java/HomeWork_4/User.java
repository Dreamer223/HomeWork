package HomeWork_4;

public class User {
    private String name;
    private int age;
    public int getStudent(){
        if(this instanceof Teacher){
            return getStudent();
        }
        return 0;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

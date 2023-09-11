package HomeWork_4;

public class Teacher extends User {
    private String course;
    private int student;

    public Teacher(String name, int age, String course, int student) {
        super(name, age);
        this.course = course;
        this.student = student;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

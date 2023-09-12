package HomeWork_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    @Override
    public List<Teacher> getall() {
        return teachers;
    }

    @Override
    public void create(String name, int age, String course, int student) {
        Teacher teacher = new Teacher(name, age, course, student);
        this.teachers.add(teacher);
    }

    public void editStudents(int index, int student) {
        Teacher teacher = teachers.get(index-1);
        teacher.setStudent(student);
        teachers.set(index-1, teacher);
        System.out.println(getall());
    }
}

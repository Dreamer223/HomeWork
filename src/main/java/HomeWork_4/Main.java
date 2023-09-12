package HomeWork_4;
public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        teacherService.create("Lexi", 24, "Math", 12);
        teacherService.create("Alex", 41, "Biology", 0);
        teacherService.create("Alen", 30, "English", 5);
        teacherService.create("Lex", 35, "Geometry", 10);
        System.out.println(teacherService.getall());
        teacherService.editStudents(1,0);
    }
}

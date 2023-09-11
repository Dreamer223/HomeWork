package HomeWork_4;

import java.util.List;

public interface UserService<T> {
    List<T> getall();
    void create(String name,int age,String course, int student);
}

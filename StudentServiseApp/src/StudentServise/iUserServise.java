package StudentServise;

import java.util.List;

public interface iUserServise<T> {
    List<T> getAll();
    void create(String firstName,String lastName, String address, int age);
}

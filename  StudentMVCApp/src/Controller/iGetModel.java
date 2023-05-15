package Controller;
import java.util.List;
import Model.Student;
/**Интерфейс Модели */
public interface iGetModel {
    List<Student> getAllStudent();
    void removeStudent(Long number);

}

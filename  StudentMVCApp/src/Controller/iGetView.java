package Controller;
import java.util.List;
import Model.Student;
/**Интерфейс Вида */
public interface iGetView {
    void printAllStudent(List<Student> stidents);
    String prompt(String message);

}

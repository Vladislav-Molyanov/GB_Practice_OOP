package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/**Класс Вид */
public class View implements iGetView {
    /**Метод печати всех студентов
     * @param List<Student> students - список студентов
     */
    public void printAllStudent(List<Student> students){

        System.out.println("**************Вывод списка студентов!***************");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("--------------Конец списка--------------------");
    }
    /**Чтение строки из консоли */
    public String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}

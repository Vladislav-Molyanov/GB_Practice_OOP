package Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Model;
import Model.ModelHM;
import Model.Student;
import View.View;
import View.ViewEng;
//**Контролер классов Вид и Модель */
public class Controller {
    /**Список студентов */
    private List<Student> students;
    /**Подключение интерфейса Вида */
    private iGetView view;
    /**Подключение интерфейса Модели */
    private iGetModel model;
    /**
     * Конструторк Контроллера
     * @param view интерфейс Вид
     * @param model интерфейс Модель
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    /**Принимает всех студентов  */
    public void getAllStudent(){
        students = model.getAllStudent();
    }
    /**
     * Метод удаления студента по идентификатору
     * @param id
     */
    public void removeStudent(Long id){
        model.removeStudent(id);
    }
    /**
     * Проверка на наличие студентов в списке
     * @return false - если список пуст
     */
    public boolean testData (){
        if (students.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /**Обновление Вида */
    public void updateView(){
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        }
        else {
            System.out.println("Список студентов пуст!");
        }


        //MVC
        //view.printAllStudent(model.getAllStudent());
    }
    /** Метод вызова команд для пользователя */
    public void run(){
        Commanders com = Commanders.NONE;
        Boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду!");
            com = Commanders.valueOf(command.toUpperCase());
            switch (com) {
                case EXET:
                getNewIteration = false;
                System.out.println("Выход из программы");
                    break;
                case LIST:
                getAllStudent();
                updateView();
                    break;
                case DELETE:
                String del = view.prompt("Введите номер студента, которого хотите удалить");
                Long test = Long.parseLong(del);
                removeStudent(test);

                    break;
                default:
                    break;
            }
        }
    }
}

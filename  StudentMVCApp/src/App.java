import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHM;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> listStudents = new ArrayList<>();
        Student student1 = new Student("Vladislav","Molyanov ", "Samara", 25, 2313);
        Student student2 = new Student("Elena","Zemlyakova ", "Buzaevka", 18, 777);
        Student student3 = new Student("Alex","Kudryashow", "Pohvestnevo", 22, 1200); 
        Student student4 = new Student("Elizaveta","Morilova", "Toll'yati", 25, 2320);
        Student student5 = new Student("Arseniy","Malone", "Samara", 21, 1001);
        Student student6 = new Student("Ivan","Ivanov", "Moscow", 18, 778);
        Student student7 = new Student("Maksim","Kushnar", "Moscow", 18, 776);
        Student student8 = new Student("Nataliya","Kazanceva", "Samara", 27, 2333);
        Student student9 = new Student("Ivan","Budko", "Moscow", 23, 3241);
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
        listStudents.add(student6);
        listStudents.add(student7);
        listStudents.add(student8);
        listStudents.add(student9);

        FileRepo fileRepo = new FileRepo("StudentDb.txt");
        for (Student student : listStudents) {
            fileRepo.addStudent(student);
        }
        // fileRepo.saveAllStudentToFile();

        iGetModel modelFileRepo = fileRepo;
        iGetView viewEng = new ViewEng();
        
        Controller controller = new Controller(viewEng, modelFileRepo);
        controller.run();
        //controller.run();


    }

}

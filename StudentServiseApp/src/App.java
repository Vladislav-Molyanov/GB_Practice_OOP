import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Vladislav","Molyanov ", "Samara", 25, 2313);
        Student student2 = new Student("Elena","Zemlyakova ", "Buzaevka", 18, 777);
        Student student3 = new Student("Alex","Kudryashow", "Pohvestnevo", 22, 1200); 
        Student student4 = new Student("Elizaveta","Morilova", "Toll'yati", 25, 2320);
        Student student5 = new Student("Arseniy","Malone", "Samara", 21, 1001);
        Student student6 = new Student("Ivan","Ivanov", "Moscow", 18, 778);
        Student student7 = new Student("Maksim","Kushnar", "Moscow", 18, 776);
        Student student8 = new Student("Nataliya","Kazanceva", "Samara", 27, 2333);
        Student student9 = new Student("Ivan","Budko", "Moscow", 23, 3241);
        Teacher teacher1 = new Teacher("Ludmila","Ivanova","Tula", 48, 01,"Philosophy");


        List<Student> listStudent1 = new ArrayList<>();
        listStudent1.add(student1);
        listStudent1.add(student2);
        listStudent1.add(student3);
        listStudent1.add(student4);
        
        StudentGroup StudentGroup1 = new StudentGroup(listStudent1,1);


        List<Student> listStudent2 = new ArrayList<>();
        listStudent2.add(student5);
        listStudent2.add(student6);
        StudentGroup studentGroup2 = new StudentGroup(listStudent2, 2);

        List<Student> listStudent3 = new ArrayList<>();
        listStudent3.add(student7);
        listStudent3.add(student8);
        listStudent3.add(student9);
        StudentGroup studentGroup3 = new StudentGroup(listStudent3, 3);

        StudentStream stream = new StudentStream(100);
        stream.addStream(StudentGroup1);
        stream.addStream(studentGroup2);
        stream.addStream(studentGroup3);

        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");
        
        Collections.sort(stream.getStream());
        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }

    }
}

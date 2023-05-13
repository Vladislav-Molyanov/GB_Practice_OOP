import java.util.List;

import Controllers.EmployeesController;
import Controllers.TeacherController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import StudentDomen.Employees;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentServise.AvgAge;

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
        Teacher teacher1 = new Teacher("Ludmila","Ivanova","Tula", 38, 01,"Philosophy","Candidate of sciences");
        Teacher teacher2 = new Teacher("Galina","Pleswakova","Moscow", 36, 02,"Economic theory","Candidate of sciences");
        Teacher teacher3 = new Teacher("Sergey","Litvinov","Moscow", 32, 03,"Game theory","PhD");
        Teacher teacher4 = new Teacher("Illnar","Nabiulin","St.Petersburg", 58, 010,"Pstchology of Personality","PhD");
        Teacher teacher5 = new Teacher("Viсtor","Hihznyak","St.Petersburg", 49, 011,"Probability theory","PhD");
        Employees employees1 = new Employees("Maksim", "Ivanov", "Moscow", 29, 115);
        Employees employees2 = new Employees("Oleg", "Kuzmin", "Samara", 41, 116);
        Employees employees3 = new Employees("Nikita", "Glushko", "Orenburg", 27, 117);
        Employees employees4 = new Employees("Mariya", "Beletskaya", "Pokhvistnevo", 45, 118);


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

        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(teacher1);
        listTeacher.add(teacher2);
        listTeacher.add(teacher3);
        listTeacher.add(teacher4);
        listTeacher.add(teacher5);

        List<Employees> listEmloyees = new ArrayList<>();
        listEmloyees.add(employees1);
        listEmloyees.add(employees2);
        listEmloyees.add(employees3);
        listEmloyees.add(employees4);


        System.out.println("-----------------------------");
        
        Collections.sort(stream.getStream());
        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }



        Employees pers1 = new Employees("German", "Graf", "Moscow", 34, 10);
        Student stud1 = new Student("Alex", "Kudryaswov", "Samara", 22, 001);
        //EmployeesController contrEmpl = new EmployeesController();
        EmployeesController.paySalary(pers1);
        TeacherController contrTeacher = new TeacherController();
        contrTeacher.paySalary(teacher1);
        Integer studentHoup[] = {124,240,231,1,45};
        System.out.println(EmployeesController.mean(studentHoup));


        Double emploSalary[] = {22504.5,34564.5,10000.0};
        System.out.println(EmployeesController.mean(emploSalary));


        AvgAge avg = new AvgAge<>();
        System.out.println("Среднее арифметическое первой группы студентов, по возрасту : ");
        avg.getAvgAge(listStudent1);
        System.out.println("Среднее арифметическое второй группы студентов, по возрасту : ");
        avg.getAvgAge(listStudent2);
        System.out.println("Среднее арифметическое третьей группы студентов, по возрасту : ");
        avg.getAvgAge(listStudent3);
        System.out.println("Среднее арифметическое преподавателей. по возрасту: ");
        avg.getAvgAge(listTeacher);
        System.out.println("Среднее арифметическое сотрудников. по возрасту: ");        
        avg.getAvgAge(listEmloyees);

    }
}

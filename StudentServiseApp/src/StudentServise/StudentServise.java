package StudentServise;

import java.util.ArrayList;
import java.util.List;
import StudentDomen.Student;

public class StudentServise implements iUserServise<Student> {
    private int countStudents;
    private List<Student> students;
    public StudentServise (){
        this.students = new ArrayList<Student>();
    }
    @Override
    public void create(String firstName, String lastName, String address, int age) {
        Student per = new Student(firstName, lastName, address, age, countStudents);
        countStudents++;
        students.add(per);
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    

}

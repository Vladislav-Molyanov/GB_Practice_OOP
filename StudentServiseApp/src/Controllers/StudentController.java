package Controllers;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentServise.StudentGroupServise;
import StudentServise.StudentServise;

public class StudentController implements iUserController<Student> {

    private final StudentServise dataServise = new StudentServise();
    private final StudentGroupServise groupServise = new StudentGroupServise();

    @Override
    public void create(String firstName, String lastName, String address, int age) {
        dataServise.create(firstName, lastName, address, age);
        
    }
    
}

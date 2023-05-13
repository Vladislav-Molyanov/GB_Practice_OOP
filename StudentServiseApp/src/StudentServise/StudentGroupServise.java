package StudentServise;

import java.util.ArrayList;
import java.util.List;
import StudentDomen.Student;

import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class StudentGroupServise {
    private List<StudentGroup> groups;

    public StudentGroupServise() {
        this.groups = new ArrayList<>();
    }

    public List<StudentGroup> getAll (){
        return this.groups;
    }

    public List<Student> getSortedByFIOStudentGroup(int numberGrop) {
        List<Student> students = new ArrayList<>(groups.get(numberGrop).getStudent());
        students.sort(new UserComparator<>());
        return students;
    }
}

package StudentServise;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherServise implements iUserServise<Teacher>{
    private int contrTeacher;
    private List<Teacher> teachers;

    public TeacherServise (){
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, String lastName, String address, int age) {
        Teacher per = new Teacher(firstName, lastName, address, age, age, lastName, address);
        contrTeacher++;
        teachers.add(per);

    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeachers(int numberGrop) {
        List<Teacher> teacher = new ArrayList<>(teachers);
        teacher.sort(new UserComparator<>());
        return teacher;
    }
    
}

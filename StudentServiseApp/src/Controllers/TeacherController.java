package Controllers;

import StudentDomen.Teacher;
import StudentServise.TeacherServise;
import StudentDomen.User;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherServise teachServise = new TeacherServise();

    @Override
    public void create(String firstName, String lastName, String address, int age) {
        teachServise.create(firstName, lastName, address, age);
    }

    public <T extends Teacher> void paySalary (T person) {
        System.out.println(((User) person).getFirstName() + ": " + "Зп 25.000 рублей");
    }

    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
    }

}

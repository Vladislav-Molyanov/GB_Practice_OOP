package Controllers;

import StudentDomen.Employees;
import StudentDomen.User;
import StudentServise.EmployeeServise;

public class EmployeesController implements iUserController<Employees> {
    private final EmployeeServise empServise = new EmployeeServise();

    @Override
    public void create(String firstName, String lastName, String address, int age) {
        empServise.create(firstName, lastName, address, age);        
    }
    static public <T extends Employees> void paySalary(T person){
        System.out.println(((User) person).getFirstName() + " ЗП 10.000 рублей ");
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

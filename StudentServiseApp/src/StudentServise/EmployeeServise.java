package StudentServise;

import java.util.ArrayList;
import java.util.List;
import StudentDomen.UserComparator;
import StudentDomen.Employees;

public class EmployeeServise implements iUserServise<Employees> {
    private int countEmployee;
    private List<Employees> employees;

    public EmployeeServise (){
        this.employees = new ArrayList<Employees>();
    }

    @Override
    public void create(String firstName, String lastName, String address, int age) {
        Employees per = new Employees(firstName, lastName, address, age, countEmployee);
        countEmployee++;
        employees.add(per);
    }

    @Override
    public List<Employees> getAll() {
            return employees;
    }

    
    

    
}

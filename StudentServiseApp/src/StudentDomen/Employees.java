package StudentDomen;

public class Employees extends User{
    private int idEmp;

    public Employees(String firstName, String lastName, String address, int age, int idEmp) {
        super(firstName, lastName, address, age);
        this.idEmp = idEmp;
    }
    
}

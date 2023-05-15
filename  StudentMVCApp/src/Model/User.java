package Model;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public User(String firstName,String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName ){
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" +
        "first name ='" + this.getFirstName() + '\'' + 
        ", last name ='" + this.getLastName() + '\'' +
        ", addres= " + this.getAddress() + '\'' +
        ", age= " + this.getAge() + 
        '}';
    }
    
}

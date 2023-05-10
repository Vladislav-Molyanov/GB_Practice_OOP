package StudentDomen;

/**Класс учителя */
public class Teacher extends User{
    /**Предмет, преподаваемый учителем */
    private String subject;
    /**Идентификатор преподавателя */
    private int idTeacher;
    /**
     * Конструктор преподавателя
     * @param firstName Имя
     * @param lastName Фамилия
     * @param address Адрес проживания 
     * @param age Возраст
     * @param idTeacher Идентификатор учителя
     * @param subject Предмет, преподаваемый учителем
     */
    public Teacher(String firstName, String lastName, String address, int age, int idTeacher, String subject) {
        super(firstName, lastName, address, age);
        this.idTeacher = idTeacher;
        this.subject = subject;
    }
    /**
     * 
     * @return Возвращает предмет, преподаваемый учителем
     */
    public String getSubject() {
        return subject;
    }
    /**
     * 
     * @param subject Принимает Предмет, преподаваемый учителем
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * 
     * @return Возвращает идентификатор учителя
     */
    public int getIdTeacher() {
        return idTeacher;
    }
    /**
     * 
     * @param idTeacher Принимает идентификатор учителя
     */
    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }
    /**Переопределение метода "toString()" */
    @Override
    public String toString() {
        return "User{" +
        "first name='" + super.getFirstName() + '\'' + 
        ", last name='" + super.getLastName() + '\'' +
        ", addres= " + super.getAddress() + '\'' +
        ", age= " + super.getAge() + '\'' + 
        ", idTeacher= " + this.getIdTeacher() + '\'' +
        ", subject= " + this.getSubject() +
        '}';
    }
    

}

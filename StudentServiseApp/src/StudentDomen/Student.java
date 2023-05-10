package StudentDomen;
/**Класс студент */
public class Student extends User implements Comparable<Student>{
    /**Идентификатор студента */
    private long idStudent;
    
    /**
     * Конструктор: студента
     * @param firstName - Имя
     * @param lastName - Фамилия
     * @param address - Aдресс проживания
     * @param age - Возраст
     * @param idStudent - Идентификатор студента
     */
    public Student(String firstName, String lastName,String address, int age, long idStudent) {
        super(firstName, lastName, address, age);
        this.idStudent = idStudent;
    }
    /**
     * 
     * @return Возвращает идентификатор студента
     */
    public long getIdStudent() {
        return idStudent;
    }
    /**
     * 
     * @param idStudent Принимает идентификатор студента 
     */
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    
    /**Переопределение метода "toString()"  */
    @Override
    public String toString() {
        return "Student{" +
        "first name='" + super.getFirstName() + '\'' + 
        ", last name='" + super.getLastName() + '\'' +
        ", addres= " + super.getAddress() + '\'' +
        ", age= " + super.getAge() + '\'' + 
        ", idStudent= " + this.getIdStudent() +
        '}'+ '\n';
    }

    /** Переопределенный  метод "compareTo"
     * @param Student 
     * @return отсортированный Список по возрасту и по идентификатору студента */
    @Override
    public int compareTo(Student o) {
         if(super.getAge()==o.getAge())
         {
            if(this.idStudent==o.idStudent)
            {
                return 0;
            }
            if(this.idStudent<o.idStudent)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
    
}

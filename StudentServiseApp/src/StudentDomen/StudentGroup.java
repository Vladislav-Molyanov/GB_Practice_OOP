package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**Класс группы студентов */
public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    /**Список студентов */
    private List<Student> students ;
    /**Идентификатор группы */
    private int idGroup;
    /**
     * Конструктор: группы студентов
     * @param students список студентов
     * @param id идентификатор студентов
     */
    public StudentGroup(List<Student> students,int id){
        this.students = students;
        this.idGroup = id;

    }
    /**
     * 
     * @return Возвращает список студентов
     */
    public List<Student> getStudent() {
        return students;
    }
    /**
     * Принимает значение 
     * @param students список студентов
     */
    public void setStudent(List<Student> students) {
        this.students = students;
    }
    /**
     * 
     * @return Возвращает идентификатор группы студентов
     */
    public int getIdGroup(){
        return idGroup;
    }
    /**
     * 
     * @return Возвращает колличество студентов в группе
     */
    public int getGroupSize(){
        return this.students.size();
    }
    /**Переопределение метода "toString()" */
    @Override
    public String toString() {
        System.out.printf("Номер группы %d",getIdGroup());
        for (Student student : students) {
            System.out.println(student);
        }
        return String.format("Колличество студентов: %d\n", students.size());
    }


    /** 
     * Подключение анонимного итератора для списка студентов
     */
    @Override
	public Iterator<Student> iterator() {
		return new Iterator<Student>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < students.size();
			}

			@Override
			public Student next() {
				if (!hasNext()) {
					return null;
				}
				// counter++;
				return students.get(index++);
			}

		};
	}
    /**
     * Метод сравнения
     * @param StudentGroup 
     * @return Возращает отсортированный списко студентов по колличеству студентов
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroupSize() == o.getGroupSize()) {
            return 0;
        } 
        if (this.getGroupSize() > o.getGroupSize()) {
            return 1;
        }

        return -1;
    }
}

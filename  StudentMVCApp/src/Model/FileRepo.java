package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;
/**Класс Репозиторий файлов */
public class FileRepo implements iGetModel {
    /**Наименование файла */
    private String fileName;
    /**Список студентов */
    private List<Student> students;
    /**
     * Конструктор Репозитория Файлов
     * @param fileName Наименование файла
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName,true)){
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Метод добавления студентов в список студентов
     * @param student студент
     */
    public void addStudent(Student student){
        this.students.add(student);
    }
    /**Метод чтения всех студентов из файла */
    public void readAllStundentsFromFile(){

        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student person = new Student(param[0], param[1], param[2], Integer.parseInt(param[3]), Long.parseLong(param[4]));
                students.add(person);
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    /**Метод сохранения всех студентов в файл */
    public void saveAllStudentToFile(){
        try(FileWriter fw = new FileWriter(fileName,true)){
            for (Student pers : students) {
                fw.write(pers.getFirstName()+" "+pers.getClass()+" "+pers.getAddress()+" "+pers.getAge()+" "+pers.getIdStudent());
                fw.append('\n');
            }
            
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**Переприсвоение метода getAllStudent*/
    @Override
    public List<Student> getAllStudent() {
        readAllStundentsFromFile();
        return students;
    }

    @Override
    public void removeStudent(Long num) {
        for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getIdStudent() == num) {
                    students.remove(i);
                }
            }
    }
}

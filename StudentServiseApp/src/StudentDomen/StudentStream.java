package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Класс студенческих потоков */
public class StudentStream implements Iterable<StudentGroup>{
    /** Список групп */
    public List<StudentGroup> streams;
    /**Идентификатор потоков */
    public int IDStream;
    
    /**
     * Конструктор студенческих потоков
     * @param NumStream номер потока
     */
    public StudentStream(int NumStream) {
        this.streams = new ArrayList<>();
        this.IDStream = NumStream;
    }

    
    /**
     * Метод добавления группы в список потоков
     * @param stream группа
     */
    public void addStream(StudentGroup stream){
        this.streams.add(stream);
    }

    /**
     * 
     * @return Возвращает идентификатор потока
     */
    public int getIdStream(){
        return IDStream;
    }
    /**
     * 
     * @return Возвращает список потоков
     */
    public List<StudentGroup> getStream() {
        return streams;
    }

    /** Переопределение метода "toString()" */
    @Override
    public String toString() {
        String streamOtput = new String();
        streamOtput = String.format("\n№Потока %d", getIdStream());
        for (StudentGroup studentGroup: streams){
            streamOtput = streamOtput + "\n" + studentGroup.getStudent() + "\n";
        }
        return streamOtput;
    }

    /**Подключение анонимного итератора для списка групп */
    @Override
	public Iterator<StudentGroup> iterator() {
		return new Iterator<StudentGroup>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < streams.size();
			}

			@Override
			public StudentGroup next() {
				if (!hasNext()) {
					return null;
				}
				return streams.get(index++);
			}
		};
	}


    
}


    

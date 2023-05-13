package StudentServise;

import java.util.List;

import StudentDomen.User;

public class AvgAge<T extends User> {
    public static <T extends User> void getAvgAge (List<T> list){
        // double sum = 0.0;
        // for (int i = 0; i < list.size(); i++) {
        //     sum = sum + num[i].doubleValue();
        // }
        // sum = sum/num.length;
        // return sum;
        double avg = 0.0;
        for (T t : list) {
            avg = avg + t.getAge();
        }
        avg = avg/list.size();
        System.out.println("Average age =" + avg);

    }
}

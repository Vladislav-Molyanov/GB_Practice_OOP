package StudentDomen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            return resultOfComparing;
        }
        else {
            return resultOfComparing;
        }
    }

    
    
}

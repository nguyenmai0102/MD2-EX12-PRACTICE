package comper3;
import java.util.Comparator;

public class AgeComparator  implements Comparable<Student>, ComparatorAge {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge().equals(o2.getAge())){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

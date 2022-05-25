package examples.collections.sortexamples;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {
    //    @Override
    public int compare(Student o1, Student o2) {
        Integer i1 = o1.getMarks();
        Integer i2 = o2.getMarks();
        return i2.compareTo(i1);
    }
}

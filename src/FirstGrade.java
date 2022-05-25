import java.util.Collections;
import java.util.TreeSet;

class Dog{
    int size;
    public Dog(int size){
        this.size = size;
    }
}
public class FirstGrade {
    public static void main(String[] args) {
        TreeSet<Integer> inSet = new TreeSet<>();
        TreeSet<Dog> dSet = new TreeSet<Dog>();
        Collections.addAll(inSet, 1,2, 3);
        dSet.add(new Dog(1));
        dSet.add(new Dog(2));

    }
}

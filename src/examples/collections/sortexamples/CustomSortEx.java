package examples.collections.sortexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable{
    private String name;
    private int std;
    private int roll;
    private int marks;

    public Student(String name, int std, int roll, int marks) {
        this.name = name;
        this.std = std;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", std=" + std +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        return s.getMarks() - this.marks;
    }
}
public class CustomSortEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Kirath", 6, 15, 92);
        Student s2 = new Student("Saikat", 8, 40, 96);
        Student s3 = new Student("Azib", 6, 1, 97);
        Collections.addAll(students, s1, s2, s3);
        students.sort(new NameComparator());
        System.out.println(students);
        students.sort(new RollNpComparator());
        System.out.println(students);

//        students.sort(new MarksComparator());
//        System.out.println(students)
        Collections.sort(students);
        System.out.println(students);

    }
}

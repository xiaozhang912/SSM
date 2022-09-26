package ArrayList;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<Student>student = new ArrayList<>();
        Student s1  = new Student("ZY",1235,"女");
        Student s2  = new Student("Zss",12351221,"男");
        Student s3  = new Student("aaY",123512,"女");

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.forEach(System.out::println);
    }



}

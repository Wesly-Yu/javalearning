package baseapi.Day03;

import java.util.ArrayList;

public class Demo04ArraylistStudent {
    public static void main(String[] args) {
        ArrayList<Student>  students = new ArrayList<>();
        Student tester1 = new Student("tester1", 20);
        Student tester2 = new Student("tester2", 28);
        Student tester3 = new Student("tester3", 35);
        students.add(tester1);
        students.add(tester2);
        students.add(tester3);
        for (int i = 0; i <students.size(); i++) {
            Student stu = students.get(i);
            System.out.println(stu.getName()+":"+stu.getAge());

        }

    }



}

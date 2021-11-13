package org.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();

        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= tc; i++) {
            int id = input.nextInt();
            String firstName = input.next();
            double cgpa = input.nextDouble();

            Student student = new Student(id, firstName, cgpa);
            studentList.add(student);
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getCgpa() == student2.getCgpa() && student1.getFirstName().equals(student2.getFirstName())) {
                    return student2.getId() - student1.getId();
                }
                if (student1.getCgpa() == student2.getCgpa()) {
                    return student1.getFirstName().compareTo(student2.getFirstName());
                }
                return student1.getCgpa() > student2.getCgpa() ? -1 : 1;
            }
        });

        for (Student student : studentList) {
            System.out.println(student.getFirstName());
        }
    }
}

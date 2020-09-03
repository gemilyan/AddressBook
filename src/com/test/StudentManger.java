package com.test;

public class StudentManger {

    static Student[] students = new Student[100];

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Вася";
        Group group = new Group();
        group.name = "1a";
        student.group = group;

        Student student1 = new Student();
        student1.name = "Петя";
        Group group1 = new Group();
        group1.name = "3b";
        student1.group = group1;


        addStudent(student);
        addStudent(student1);



        printStudents(students);
    }

    static void addStudent(Student student) {

        for(int i=0; i < students.length; i++){
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    static void printStudents(Student[] students) {
        for(Student student: students) {
            if(student != null) {
                System.out.println(student.name + " " + student.group.name);
                //System.out.println(student.group.name);
            }
        }
    }
}

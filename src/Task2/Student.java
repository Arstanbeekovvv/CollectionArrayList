package Task2;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student() {
    }

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static Student getStudent() {
        Student student = new Student();
        student.setName(new Scanner(System.in).nextLine());
        student.setAge(new Scanner(System.in).nextInt());
        student.setGroup(new Scanner(System.in).nextLine());
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '\n';
    }
}

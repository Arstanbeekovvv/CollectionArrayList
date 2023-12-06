package Task2;

import java.util.ArrayList;

public class Service {
    static ArrayList<Student> arrayList = new ArrayList<>();
    static ArrayList<Student> java = new ArrayList<>();
    static ArrayList<Student> javaScript = new ArrayList<>();
    static ArrayList<Student> age1923 = new ArrayList<>();
    static ArrayList<Student> startA = new ArrayList<>();

    public static void  addStudent(Student student){
        arrayList.add(student);
    }

    public static  void getALlStudent(){
        for (Student student : arrayList) {
            System.out.println(student);
            System.out.println("----------------");
        }
    }
    public static void sortStudents(){
        for (Student student : arrayList) {
            if(student.getGroup().equals("java")){
                java.add(student);
            }else{
                javaScript.add(student);
            }
        }
    }
    public static void sortAge(){
        for (Student student : arrayList) {
            if(student.getAge() >= 19 && student.getAge() < 23){
                age1923.add(student);
            }
        }
    }
    public static void startA(){
        for (Student student : arrayList) {
            if(student.getName().startsWith("A")){
                startA.add(student);
            }
        }
    }

}

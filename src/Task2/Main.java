package Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("ADD STUDENT: ");
        Student[] student = new Student[]{
                new Student("Mirlan", 17, "java"),
                new Student("Mirlan", 12, "java"),
                new Student("Mirlan", 18, "javaScript"),
                new Student("Mirlan", 19, "java"),
                new Student("Mirlan", 18, "javaScript"),
                new Student("Mirlan", 21, "java"),
                new Student("Mirlan", 22, "javaScript"),
                new Student("Mirlan", 14, "java"),
                new Student("Mirlan", 112, "javaScript"),
                new Student("Ali", 20, "java"),
        };
        for (int i = 0; i < student.length; i++) {
            Service.addStudent(student[i]);
        }
        System.out.println("ALL STUDENTS: ");
        Service.getALlStudent();
        System.out.println("SORT STUDENTS:");
        Service.sortStudents();
        System.out.println(Service.java);
        System.out.println(Service.javaScript);
        System.out.println("Sort AGE");
        Service.sortAge();
        System.out.println(Service.age1923);
        System.out.println("Startwith 'A'");
        Service.startA();
        System.out.println(Service.startA);

    }


}

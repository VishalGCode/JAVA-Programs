package assignment_que1;

public class Student {
    int rollNo;
    String name;
    String sex;
    int age;
    String studentClass;

    public Student(int rollNo, String name, String sex, int age, String studentClass) {
        this.rollNo = rollNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.studentClass = studentClass;
    }

    public void toStudy() {
        System.out.println(name + " is studying in class " + studentClass + ".");
    }

    public void toPlay() {
        System.out.println(name + " is playing.");
    }
}

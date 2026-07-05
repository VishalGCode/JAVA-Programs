
package demoAccessorMutator;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Rishi");
        student.setRoll(23);
        student.setPercentage(89.5f);

        // Getting and printing values using getter methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRoll());
        System.out.println("Percentage: " + student.getPercentage());
    }
}

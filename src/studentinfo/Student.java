package studentinfo; // define the package

public class Student {
	/*Lab Experiment: 6
	Name- Rishi Tiwari
	Roll No- 2301641720090
	*/
    // Fields
    public String name;
    public int age;
    public String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

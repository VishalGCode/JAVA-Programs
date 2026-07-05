package labFile;

public class Main {
	
	/*Lab Experiment: 3
	Name- Rishi Tiwari
	Roll No- 2301641720090
	*/
	
    public static void main(String[] args) {
        // Creating Student object and setting values
        Student student1 = new Student();
        student1.name = "Rishi Tiwari";
        student1.rollNo = 30;
        student1.displayStudentDetails();

        System.out.println(); // Blank line for separation

        // Creating Rectangle object and setting values
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 5.5;
        rectangle1.width = 3.0;
        rectangle1.displayArea();
    }
}
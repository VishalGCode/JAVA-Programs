package labFile;

//Exp-6
import studentinfo.Student; // import the user-defined package

public class Main2 {
    public static void main(String[] args) {
        // Create object of Student
        Student s = new Student("Rishi Tiwari", 20, "Cyber Security");

        // Call method to display info
        s.displayInfo();
    }
}

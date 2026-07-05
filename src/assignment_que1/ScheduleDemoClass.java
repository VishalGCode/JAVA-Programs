package assignment_que1;

public class ScheduleDemoClass {
    public static void main(String[] args) {
        // Create 5 students
        Student[] students = new Student[5];
        students[0] = new Student(1, "Rishi", "Male", 20, "CYS-A");
        students[1] = new Student(2, "Poonam", "Female", 19, "CYS-A");
        students[2] = new Student(3, "Shriya", "Female", 20, "CYS-B");
        students[3] = new Student(4, "Satyam", "Male", 21, "CYS-B");
        students[4] = new Student(5, "Abhay", "Male", 20, "CS-A");

        // Create 1 faculty
        Faculty faculty = new Faculty("F001", "Kumar Saurabh Sir", "Java");

        // Create a LectureRoom
        LectureRoom room = new LectureRoom("AA_24", 180, true);

        // Schedule the class
        room.scheduleClass(faculty, students);

        // Additional functionalities
        System.out.println("\nOther Activities:");
        faculty.givingExams();
        for (Student student : students) {
            student.toPlay();
        }
    }
}


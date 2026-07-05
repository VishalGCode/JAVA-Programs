package assignment_que1;

public class Faculty {
    String facultyCode;
    String facultyName;
    String subjectExpert;

    public Faculty(String facultyCode, String facultyName, String subjectExpert) {
        this.facultyCode = facultyCode;
        this.facultyName = facultyName;
        this.subjectExpert = subjectExpert;
    }

    public void takingClasses() {
        System.out.println(facultyName + " is taking classes in " + subjectExpert + ".");
    }

    public void givingExams() {
        System.out.println(facultyName + " is conducting exams for " + subjectExpert + ".");
    }
}


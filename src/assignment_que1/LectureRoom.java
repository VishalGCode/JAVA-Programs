package assignment_que1;

public class LectureRoom {
    String roomNumber;
    int noOfSeats;
    boolean byod;

    public LectureRoom(String roomNumber, int noOfSeats, boolean byod) {
        this.roomNumber = roomNumber;
        this.noOfSeats = noOfSeats;
        this.byod = byod;
    }

    public void scheduleClass(Faculty faculty, Student[] students) {
        System.out.println("Class is scheduled in room " + roomNumber + ".");
        System.out.println("BYOD enabled: " + byod);
        faculty.takingClasses();
        for (Student student : students) {
            student.toStudy();
        }
    }
}


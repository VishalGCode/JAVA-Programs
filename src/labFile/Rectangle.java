package labFile;

class Rectangle {
    double length;
    double width;

    // Method to calculate and display area
    void displayArea() {
        double area = length * width;
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Area of Rectangle: " + area);
    }
}
package assignment_que3;

public class DemoArray {
    int[] arr = new int[5];

    // Method to initialize the array
    public void init() {
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 7;
        arr[4] = 2;
        // 2nd Method-- arr={10,5,3,7,2};
    }

    // Method to display the elements
    public void display() {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to find multiplication of all elements
    public void multiplyElements() {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        System.out.println("Multiplication of all elements: " + product);
    }

}
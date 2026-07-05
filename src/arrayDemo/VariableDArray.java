package arrayDemo;

public class VariableDArray {
    int arr[][] = new int[5][]; // Array of 5 rows with undefined columns initially

    // Constructor to initialize each row with a different column size
    public VariableDArray() {
        arr[0] = new int[2]; // row 0 with 2 columns
        arr[1] = new int[4]; // row 1 with 4 columns
        arr[2] = new int[6]; // row 2 with 6 columns
        arr[3] = new int[8]; // row 3 with 8 columns
        arr[4] = new int[1]; // row 4 with 1 column
    }

    void init() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 3;
            }
        }
    }

    void prn() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }

    public static void main(String args[]) {
        VariableDArray vd = new VariableDArray();
        vd.init();
        vd.prn();
    }
}

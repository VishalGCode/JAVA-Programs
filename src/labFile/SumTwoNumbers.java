package labFile;

public class SumTwoNumbers {
	/*Lab Experiment: 2
	Name- Rishi Tiwari
	Roll No- 2301641720090
	*/

    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer numbers as command-line arguments.");
            return;
        }

        try {
            // Parse the command-line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be valid integers.");
        }
    }
}


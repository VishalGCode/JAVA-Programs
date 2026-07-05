package selfish;

import java.util.Base64;

public class Base64Encoder {
    public static void main(String[] args) {
        String original = "hello i'm rishi";

        // Encode
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());

        // Output
        System.out.println("Original: " + original);
        System.out.println("Encoded : " + encoded);
    }
}


package selfish;

import java.util.Base64;

public class Base64Decoder {
    public static void main(String[] args) {
        String encoded = "aGVsbG8gaSdtIHJpc2hp";

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);

        // Output
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}

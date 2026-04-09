abstract class Cipher {
    abstract String encrypt(String text);
    abstract String decrypt(String text);
}

class CaesarCipher extends Cipher {
    private int shift;

    CaesarCipher(int shift) {
        this.shift = shift;
    }

    String encrypt(String text) {
        String result = "";
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result += (char) ((ch - base + shift) % 26 + base);
            } else {
                result += ch;
            }
        }
        return result;
    }

    String decrypt(String text) {
        String result = "";
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result += (char) ((ch - base - shift + 26) % 26 + base);
            } else {
                result += ch;
            }
        }
        return result;
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Cipher cipher = new CaesarCipher(3);

        String original = "Hello World";
        String encrypted = cipher.encrypt(original);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}

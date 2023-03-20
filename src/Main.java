import java.security.SecureRandom;
import java.util.Scanner;
public class Main {
    private static final String CHARACTERS ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?1234567890";
    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter password length: ");
     int length = input.nextInt();
     String password = generatePassword(length);
     System.out.println("Generated Password: " + password);
    }
    public static String generatePassword(int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
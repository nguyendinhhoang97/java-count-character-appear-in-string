import java.util.Scanner;

public class CountCharacterString {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String str;
        char character;
        str = scanner.next();
        System.out.println("Input chacracter need checked: ");
        character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("The number of times the character " + character + " appears is " + count);
    }
}

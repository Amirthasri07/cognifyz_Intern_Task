// import java.io.*;
// public class palindromechecker{
//     public static void main(String[] args){
//         System.out.println("Hi");
//     }
// }
import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String or word: ");
        String str = scan.nextLine();

        // Clean and normalize the input (only letters, lowercase)
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        // Convert to string for comparison
        String cleanedStr = cleaned.toString();

        // Reverse the string manually using a loop
        String revStr = "";
        for (int i = cleanedStr.length() - 1; i >= 0; i--) {
            revStr += cleanedStr.charAt(i);
        }

        // Check for palindrome
        if (cleanedStr.equals(revStr)) {
            System.out.println("✅ The given string is a Palindrome");
        } else {
            System.out.println("❌ The entered string is not a Palindrome");
        }

        scan.close();
    }
}

import java.util.Scanner;
class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String or word: ");
        String str = scan.nextLine();
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        String cleanedStr = cleaned.toString();
        String revStr = "";
        for (int i = cleanedStr.length() - 1; i >= 0; i--) {
            revStr += cleanedStr.charAt(i);
        }
        if (cleanedStr.equals(revStr)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The entered string is not a Palindrome");
        }
    }
}

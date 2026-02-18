import java.util.Scanner;

public class Ques2 {

    // 1. Change Case
    public static void changeCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }
        System.out.println("Changed Case: " + result);
    }

    // 2. Reverse String
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // 3. Compare Strings
    public static void compareStrings(String s1, String s2) {
        if (s1.equals(s2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
    }

    // 4. Insert String
    public static void insertString(String s1, String s2, int pos) {
        if (pos >= 0 && pos <= s1.length()) {
            String result = s1.substring(0, pos) + s2 + s1.substring(pos);
            System.out.println("After Insertion: " + result);
        } else {
            System.out.println("Invalid Position!");
        }
    }

    // 5. Convert Case
    public static void convertCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // 6. Character Search
    public static void searchCharacter(String str, char ch) {
        int index = str.indexOf(ch);
        if (index != -1)
            System.out.println("Character found at position: " + index);
        else
            System.out.println("Character not found.");
    }

    // 7. Palindrome Check
    public static void checkPalindrome(String str) {
        String reverse = reverseString(str);
        if (str.equals(reverse))
            System.out.println("String is Palindrome.");
        else
            System.out.println("String is not Palindrome.");
    }

    // 8. Count Words, Vowels, Consonants
    public static void countAll(String str) {
        int vowels = 0, consonants = 0;
        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        int words = str.trim().split("\\s+").length;

        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n===== MENU =====");
        System.out.println("1. Change Case");
        System.out.println("2. Reverse String");
        System.out.println("3. Compare Strings");
        System.out.println("4. Insert String");
        System.out.println("5. Convert Case");
        System.out.println("6. Character Search");
        System.out.println("7. Palindrome Check");
        System.out.println("8. Count Words, Vowels, Consonants");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                changeCase(str1);
                break;

            case 2:
                System.out.println("Reversed String: " + reverseString(str1));
                break;

            case 3:
                compareStrings(str1, str2);
                break;

            case 4:
                System.out.print("Enter position to insert: ");
                int pos = sc.nextInt();
                insertString(str1, str2, pos);
                break;

            case 5:
                convertCase(str1);
                break;

            case 6:
                System.out.print("Enter character to search: ");
                char ch = sc.next().charAt(0);
                searchCharacter(str1, ch);
                break;

            case 7:
                checkPalindrome(str1);
                break;

            case 8:
                countAll(str1);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

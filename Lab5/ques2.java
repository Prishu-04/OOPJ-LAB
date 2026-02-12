import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);

        // i) Change case
        System.out.println("\n1. Change Case:");
        String changedCase = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isUpperCase(c))
                changedCase += Character.toLowerCase(c);
            else
                changedCase += Character.toUpperCase(c);
        }
        System.out.println("Changed Case: " + changedCase);

        // ii) Reverse the string
        System.out.println("\n2. Reverse String:");
        String reverse = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);

        // iii) Compare two strings
        System.out.println("\n3. Compare Strings:");
        if (str1.equals(str2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");

        // iv) Insert one string into another
        System.out.println("\n4. Insert str2 into str1:");
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();
        String result = str1.substring(0, pos) + str2 + str1.substring(pos);
        System.out.println("After Insertion: " + result);

        // v) Convert to upper and lower case
        System.out.println("\n5. Upper and Lower Case:");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // vi) Check character present and position
        System.out.println("\n6. Character Search:");
        int index = str1.indexOf(ch);
        if (index != -1)
            System.out.println("Character found at position: " + index);
        else
            System.out.println("Character not found.");

        // vii) Check palindrome
        System.out.println("\n7. Palindrome Check:");
        if (str1.equals(reverse))
            System.out.println("String is Palindrome.");
        else
            System.out.println("String is not Palindrome.");

        // viii) Count words, vowels, consonants
        System.out.println("\n8. Count Words, Vowels, Consonants:");

        int vowels = 0, consonants = 0;
        String lower = str1.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        int words = str1.trim().split("\\s+").length;

        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}
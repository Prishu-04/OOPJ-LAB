import java.util.*;

public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check command line argument
        if (args.length < 1) {
            System.out.println("Please provide first string as command line argument.");
            return;
        }

        String str1 = args[0]; // "Welcome"

        // Input second string using Scanner
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine(); // "Back to India"

        // Concatenate strings
        String combined = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + combined);

        // Split into words
        String[] parts = combined.split(" ");

        // Ensure we have at least 4 parts
        if (parts.length < 4) {
            System.out.println("Not enough parts to split into 4 strings.");
            return;
        }

        // Store into 4 different string objects
        String s1 = parts[0];
        String s2 = parts[1];
        String s3 = parts[2];
        String s4 = parts[3];

        // Display all 4 strings
        System.out.println("\nSplit Strings:");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("String 3: " + s3);
        System.out.println("String 4: " + s4);

        sc.close();
    }
}
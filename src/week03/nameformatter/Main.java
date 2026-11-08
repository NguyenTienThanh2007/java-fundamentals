//Write a program that prompts a user to enter their full name on a single line (e.g., "John
//Allen Smith" or "Jane Doe"). The program must validate the input and format it into a
//username/ID string.
//Requirements:
//1. Selection: Use String methods to check if the user entered at least a first and last
//name (look for spaces). If no spaces are found, print an error message: "Invalid
//name format."
//2. String Manipulation:
//o If the name has 3 parts (two spaces detected), extract the first name and the
//initials of the middle and last names to print a shortened version (e.g., "John
//A. S.").
//o If the name has 2 parts (one space detected), print the first name and the last
//name initial (e.g., "Jane D.").
//3. Case formatting: Ensure the first letter of the names/initials is always capitalized
//using toUpperCase(), even if the user types them in lowercase.
//Example
//Input: john allen smith
//Expected Output: John A. S.
//Example 2
//Input: jANe dOe
//RMIT Classification: TrustedExpected Output: Jane D.
//Example 3
//Input: Alex
//Expected Output: Invalid name format.

package week03.nameformatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Invalid name format");
        } else {
            String[] words = name.trim().split("\\s+");

            if (words.length == 1 || words.length > 3) {
                System.out.println("Invalid name format");

            } else if (words.length == 2) {
                String firstName = words[0].substring(0, 1).toUpperCase()
                        + words[0].substring(1).toLowerCase();

                String lastInitial = words[1].substring(0, 1).toUpperCase();

                System.out.println(firstName + " " + lastInitial + ".");

            } else if (words.length == 3) {
                String firstName = words[0].substring(0, 1).toUpperCase()
                        + words[0].substring(1).toLowerCase();

                String middleInitial = words[1].substring(0, 1).toUpperCase();
                String lastInitial = words[2].substring(0, 1).toUpperCase();

                System.out.println(firstName + " " + middleInitial + ". " + lastInitial + ".");
            }
        }


    }
}

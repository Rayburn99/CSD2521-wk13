// Brenden Rayburn
// 11/23/2021

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full name: ");
        String name = sc.nextLine();
        System.out.println();
        
        name = name.trim();
        
        int index1 = name.indexOf(" ");
        // if only 1 word is entered, print error
        if (index1 == -1) {
            System.out.println("Error reading name");
        } else {
            int index2 = name.indexOf(" ", index1 + 1);
            // 2 part names are accepted
            if (index2 == -1) {
                String fName = name.substring(0, index1);
                String lName = name.substring(index1 + 1);
                
                System.out.println("First name: " + fName);
                System.out.println("Last name: " + lName);
            } else {
                int index3 = name.indexOf(" ", index2 + 1);
                // 3 part names are accepted
                if (index3 == -1) {
                    String fName = name.substring(0, index1);
                    String mName = name.substring(index1 + 1, index2);
                    String lName = name.substring(index2 + 1);
                    
                    System.out.println("First name: " + fName);
                    System.out.println("Middle name: " + mName);
                    System.out.println("Last name: " + lName);
                } else {
                    // if anything else happens, print error
                    System.out.println("Invalide name format");
                }
            }
            
        }
        
    }
}

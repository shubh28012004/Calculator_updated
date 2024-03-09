package Assignment7;

import java.util.Scanner;

public class Exception {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string: ");
            String str = sc.nextLine();
 
            if (str.equalsIgnoreCase("Hello")) {
                throw new CustomException();
            } else {
                System.out.println("Message is : " + str);
            }

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}   
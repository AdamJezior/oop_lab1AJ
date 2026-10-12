package ie.atu;

import java.util.Scanner;

public class ExeptionWarmUp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean valid=false;

        while(!valid) {
            System.out.println("Enter a page count: ");
            String text = scan.nextLine();
            try {
                int pageCount = Integer.parseInt(text);
                System.out.println("you entered: " + pageCount);
                valid=true;
            }
            catch (NumberFormatException e) {
                System.out.println("invalid entry " + e.getMessage());
            }
        }
    }
}

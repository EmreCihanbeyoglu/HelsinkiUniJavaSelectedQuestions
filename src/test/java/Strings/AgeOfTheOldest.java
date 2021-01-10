package Strings;

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        int greatest = 0;


        while (true) {

            message = scanner.nextLine();
            if (message.equals("")) {
                break;
            }

            String [] rows = message.split(",");
            if (greatest < Integer.valueOf(rows[1])) {
                greatest = Integer.valueOf(rows[1]);
            }


        }
        System.out.println("Age of the oldest: " + greatest);

    }
}
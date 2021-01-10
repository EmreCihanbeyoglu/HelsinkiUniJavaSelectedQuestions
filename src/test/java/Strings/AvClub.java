package Strings;

import java.util.Scanner;

public class AvClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = "";
        while(true){

            message = scanner.nextLine();

            if (message.equals("")) {
                break;
            }

            String[] arrays = message.split(" ");

            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].contains("av")) {
                    System.out.println(arrays[i]);
                }
            }

        }

    }
}
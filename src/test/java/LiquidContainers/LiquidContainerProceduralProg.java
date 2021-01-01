package LiquidContainers;

import java.util.Scanner;

public class LiquidContainerProceduralProg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] arr = input.split(" ");
            String command = arr[0];
            int amount = Integer.parseInt(arr[1]);
            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }else if(command.equals("move")){
                if(amount <= first){
                    first -= amount;
                    second += amount;
                    second = second > 100 ? 100 : second;
                }else if(amount > first){
                    second += first;
                    first = 0;
                    second = second > 100 ? 100 : second;
                }
            }else if (command.equals("remove")) {
                second = second - amount;
                if (second <= 0) {
                    second = 0;
                }
            }

        }
    }
}

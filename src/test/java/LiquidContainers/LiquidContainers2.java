package LiquidContainers;


import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] arr = input.split(" ");
            String command = arr[0];
            int amount = Integer.parseInt(arr[1]);

            switch(command){
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    amount = first.contains() <= amount ? first.contains() : amount;
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                default:
                    break;

            }

        }
    }

}

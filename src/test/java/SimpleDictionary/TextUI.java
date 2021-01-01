package SimpleDictionary;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);

            }else if (command.equals("search")) {
                System.out.print("to be translated: ");
                String word = this.scanner.nextLine();
                String translation = this.simpleDictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                }else{
                    System.out.println("Translation: " + translation);
                }
            }else{
                System.out.println("Unknown command");
            }


        }
    }


}

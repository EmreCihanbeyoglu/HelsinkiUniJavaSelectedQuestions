package PrintingStarsWithMethod;

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = size - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(size - i);
            //System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            //printSpaces(height - i);
            //System.out.println("");
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            //printSpaces(height - 2);
            //System.out.println("");
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

//          printSpaces(4);
//          printStars(1);
//        printTriangle(4);
//        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

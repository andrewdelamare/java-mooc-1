
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        int maxw = (height * 2) + 1;
        while (i < height) {
            int st = (2 * i) + 1;
            int sp = (maxw - st) / 2;
            printSpaces(sp - 1);
            printStars(st);
            i++;

        }

        printSpaces(((maxw - 3) / 2) - 1);
        printStars(3);
        printSpaces(((maxw - 3) / 2) - 1);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

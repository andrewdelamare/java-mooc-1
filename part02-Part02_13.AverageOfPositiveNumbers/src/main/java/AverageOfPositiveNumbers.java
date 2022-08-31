
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input != 0 && input > 0) {
                num += input;
                count++;
            } else if (input == 0 && num > 0) {
                System.out.println("Average of the numbers: " + ((double) num / count));
                break;
            } else if (input == 0 && num == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
        }
    }
}

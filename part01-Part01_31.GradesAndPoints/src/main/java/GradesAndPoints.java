
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int input = Integer.valueOf(scan.nextLine());
        if (input < 0) {
            System.out.println("impossible!");
        } else if (input <= 49) {
            System.out.println("Grade: failed");
        } else if (input >= 50 && input <= 59) {
            System.out.println("Grade: 1");
        } else if (input >= 60 && input <= 69) {
            System.out.println("Grade: 2");
        } else if (input >= 70 && input <= 79) {
            System.out.println("Grade: 3");
        } else if (input >= 80 && input <= 89) {
            System.out.println("Grade: 4");
        } else if (input >= 90 && input <= 100) {
            System.out.println("Grade: 5");
        } else if (input > 100) {
            System.out.println("Grade: incredible!");
        }
    }
}

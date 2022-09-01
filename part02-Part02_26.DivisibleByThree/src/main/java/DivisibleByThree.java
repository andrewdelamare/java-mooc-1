
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int first, int second) {
        int i = first;
        while(i <= second){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
        
    }
}

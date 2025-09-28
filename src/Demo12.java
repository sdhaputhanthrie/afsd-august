//use input a number. get that number and divide it 10 and the remained values are print reverse
import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scan.nextInt();
        while (number != 0){
            int digit = number % 10;
            System.out.print(digit);
            number = number/10;

        }
    }
}

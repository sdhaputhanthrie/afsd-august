//plug scanner
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){

        //scanner setup
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1:");
        int val1 = scan.nextInt();

        System.out.print("Enter number 2:");
        int val2 = scan.nextInt();

        int answer = val1 + val2;
        System.out.println(answer);

    }
}




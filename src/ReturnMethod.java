//create a method named findAvailability to find a specific value is containing in the array
import java.util.Scanner;
public class ReturnMethod {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] ar2 = {12,78,45,65,98,56};
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        boolean found =  findAvailability(ar2, num);

    }
    public static boolean findAvailability(int[]ar2, int num) {
        for (int i = 0; i < ar2.length; i++) {
            if (num == ar2[i]) {
             return true;
            }
        }
        return false;
    }
}

//there are 21 employee in a company get their ages and store them in proper way get age limit as user input create a method to find how many employee as in given range
import java.util.Scanner;
public class Demo16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[]age = new int[21];
        for(int i =0;i<21;i++){
            System.out.print("Enter your age:");
            age[i] = scan.nextInt();

        }
        System.out.print("Enter age limit:");
        int age_limit = scan.nextInt();

        check_age(age,age_limit);
    }
    public static void check_age(int[] age, int age_limit){
        int count= 0;
        for(int i =0;i<21; i++){
          if(age[i]== age_limit){
              count ++;
          }
        }
        System.out.print("employees in that age is  "+ count);

    }
}

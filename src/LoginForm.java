import java.util.Scanner;
public class LoginForm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double total_tax =0;
        for(int i =0; i<12; i++){
            System.out.print("Enter your salary:");
            double salary = scan.nextDouble();

            if(salary >130000){
                total_tax += salary*14/100;

            }
        }
        System.out.println("total tax is "+total_tax);
    }
}

// get 8 empolyee salary as a user input
// if salary above 130000 add 12% and exiting salary

// find over cost of the company
import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[]salary = new double[8];

        for(int i=0; i<8; i++){
            System.out.print("Enter your Salary:");
            salary[i] = scan.nextDouble();
        }
        double[]new_salary = new double[8];
        for(int i=0; i<8; i++){
            if(salary[i]>130000){
                new_salary[i] = (salary[i]*12/100)+salary[i];
            }else{
                new_salary[i]=salary[i];
            }
        }
        double total =0;
        for (int i=0; i<8;i++){
            total += salary[i];
        }

        double over_salary=0;
        for(int i=0; i<8;i++){
            over_salary += new_salary[i];
        }
        System.out.println("over cost is "+(total-over_salary) );
    }
}

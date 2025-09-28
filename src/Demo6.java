import java.util.Scanner;
public class Demo6 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Salary:");
        double income1 = scan.nextDouble();

        System.out.print("Enter your income from the kudu business: ");
        double income2 = scan.nextDouble();

        System.out.print("Enter Your income from the lands:");
        double income3 = scan.nextDouble();



        if(income1>=115000){
            income1=income1*14/100;
        }
        else{
             income1 = income1;
        }

        if(income2 ==0){
            income2 = income2;
        }
        else{
            income2 = income2*50/100;
        }
        System.out.println("final income without tax:" +(income1+income2+income3));


    }
}

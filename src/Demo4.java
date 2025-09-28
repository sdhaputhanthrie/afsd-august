//there are 4 businessman in city
//take their august month income as user inputs
//find their avg monthly income
//every employee should pay 13% tax from their income
//find the total tax value they pay for government

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your monthly income:");
        double emp1 = scan.nextDouble();

        System.out.print("Enter your monthly income:");
        double emp2 = scan.nextDouble();

        System.out.print("Enter your monthly income:");
        double emp3 = scan.nextDouble();

        System.out.print("Enter your monthly income:");
        double emp4 = scan.nextDouble();

        System.out.println("Monthly income average is - " + ((emp1+emp2+emp3+emp4)/4));
        System.out.println("Total tax value - "+((emp1+emp2+emp3+emp4)*13/100));
    }
}

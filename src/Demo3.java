//there are 4 employees in orange(pvt) ltd
//get their salaries as user inputs
//then find the avg salary of an employee

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your salary:");
        double salary1 = scan.nextDouble();

        System.out.print("Enter your salary:");
        double salary2 = scan.nextDouble();

        System.out.print("Enter your salary:");
        double salary3 = scan.nextDouble();

        System.out.print("Enter your salary:");
        double salary4 = scan.nextDouble();

        System.out.println("Answer is - "+((salary1+salary2+salary3+salary4)/4));

    }
}

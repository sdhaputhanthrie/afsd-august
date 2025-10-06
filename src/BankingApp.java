//Banking system
//ABC bank can hold 13 bank accounts
//accounts should have -> Holder's name, account number, amount /create all bank accounts with proper user inputs
//Able to deposit or withdraw money by inserting account no and amount at any time
import java.util.Scanner;
public class BankingApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[]holder_name = new String[13];
        int[] account_no = new int[13];
        double[]amount = new double[13];
        for(int i =0; i<13;i++){
            System.out.print("Enter account Holder's name:");
            holder_name[i] = scan.next();
            System.out.print("Enter account number:");
            account_no[i] = scan.nextInt();
            System.out.print("Enter your balance:");
            amount[i] = scan.nextDouble();
        }
        int choice =0;
        double new_amount = 0;
        int num1 =0;

        while(true){
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter account number:");
                    num1 = scan.nextInt();
                    for(int i =0; i<13; i++) {
                        if(account_no[i] == num1){
                            System.out.print("Enter deposit money:");
                            new_amount= scan.nextDouble();
                           amount[i]+=new_amount;

                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter account number:");
                    num1 = scan.nextInt();
                    for (int i =0; i<13; i++){
                        if(account_no[i] == num1){
                            System.out.print("Enter withdraw money:");
                            new_amount = scan.nextDouble();
                            amount[i] -= new_amount;
                        }
                    }
                    break;
                default:
                    System.out.println("invail account");

        }


        }
    }
}

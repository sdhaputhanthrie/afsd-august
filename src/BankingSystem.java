import java.util.Scanner;
public class BankingSystem {
    static String[] holder_name = new String[0];
    static int[] account_number = new int[0];
    static String[]  account_type = new  String[0];
    static double[] account_balance = new double[0];



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(true){
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Apply for Loan");
            System.out.println("6. View Loan Details");
            System.out.println("7. Transfer Funds");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    createAccount(scan);
                    break;
                case 2:
                    deposit(scan);
                    break;
                case 3:
                    withdraw(scan);
                    break;
                case 4:
                    check_balance(scan);
                    break;
            }
        }
    }
    public static void createAccount(Scanner scan){
        System.out.print("Enter Account Holder Name: ");
        String name = scan.next();
        holder_name = addString(holder_name, name);
        System.out.print("Enter Account Number:");
        int number = scan.nextInt();
        account_number = addInt(account_number,number);
        System.out.print("Enter Account type (saving/wanitha/wasana): ");
        String type = scan.next();
        account_type = addString(account_type, type);
        System.out.print("Enter Initial Deposit: ");
        double deposit = scan.nextDouble();
        account_balance = addDouble(account_balance,deposit);
    }

    public static String[] addString(String[] ar, String new_value ){
        String[] newAr = new String[ar.length + 1];
        for(int i =0; i< ar.length; i++){
            newAr[i] = ar[i];
        }
        newAr[ar.length] = new_value;
        return  newAr;
    }

    public static int[] addInt(int[] ar, int new_value){
        int[] newAr = new int[ar.length +1];
        for (int i =0; i<ar.length; i++){
            newAr[i] = ar[i];
        }
        newAr[ar.length] = new_value;
        return newAr;
    }
    public static double[] addDouble(double[] arr, double value){
        double[] newArr = new double[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        return newArr;
    }

    public static void deposit(Scanner scan){
        System.out.print("Enter account number:");
        int number = scan.nextInt();

        for(int i=0; i<account_number.length; i++){
            if(account_number[i] == number){
                System.out.print("Enter deposit money:");
                double amount = scan.nextDouble();
                account_balance[i] += amount;
                System.out.println(" New Balance: " + account_balance[i]);
                break;

            }
        }
    }

    public static void withdraw(Scanner scan){
        System.out.print("Enter account number:");
        int number = scan.nextInt();

        for(int i=0; i<account_number.length; i++){
            if(account_number[i] == number){
                System.out.print("Enter withdraw money:");
                double amount = scan.nextDouble();
                account_balance[i] -= amount;
                System.out.println(" New Balance: " + account_balance[i]);
                break;

            }
        }
    }

    public static void check_balance(Scanner scan){
        System.out.print("Enter account number");
        int number = scan.nextInt();

        for(int i=0; i<account_number.length; i++){
            if(account_number[i] == number){
                System.out.println("you're balance is:" + account_balance[i]);
                break;
            }
        }
    }
}

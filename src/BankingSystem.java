import java.util.Scanner;
public class BankingSystem {
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
        }
    }
}

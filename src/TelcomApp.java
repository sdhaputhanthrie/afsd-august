//user login
//Question: user count
//how many sim cards?if 2, then 1st sim? 2nd sim?
//3 sims-dialog,mobitel,airtel
import java.util.Scanner;
public class TelcomApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String db_email = "admin@gmail.com";
        int db_password = 1234;

        System.out.print("Enter your email:");
        String email = scan.next();
        System.out.print("Enter your password:");
        int password = scan.nextInt();

         if(db_email.equals(email) && db_password==password){
             System.out.println("Login success!");
             System.out.print("How many people do you expect today? ");
             int count = scan.nextInt();
             int dialog_count =0;
             int mobitel_count =0;
             int airtel_count =0;
             for (int i=0; i<count; i++){
                 System.out.print("How many SIM cards do you have?");
                 int card = scan.nextInt();

                 for (int y=0; y<card;y++) {
                     System.out.print("Enter your SIM card" + (y + 1) + ":");
                     String card_name = scan.next();
                     if (card_name.equals("Dialog")) {
                         dialog_count += 1;
                     } else if (card_name.equals("Mobitel")) {
                         mobitel_count += 1;
                     } else if (card_name.equals("Airtel")) {
                         airtel_count += 1;
                     }

                 }
                 }
                 if(dialog_count>mobitel_count && dialog_count>airtel_count){
                     System.out.println("Dialog is the most popular SIM card today");
                 } else if (mobitel_count>airtel_count && mobitel_count>dialog_count) {
                     System.out.println("Mobitel is the most popular SIM card today");
                 }else{
                     System.out.println("Airtel is the most popular SIM card today");
                 }

         }
         else{
             System.out.println("Login failed");
         }


    }
}

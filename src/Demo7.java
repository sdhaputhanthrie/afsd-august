import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter boy's age:");
        int boy_age = scan.nextInt();

        System.out.print("Enter girl's age:");
        int girl_age = scan.nextInt();

        if(boy_age > girl_age){
            System.out.print("Enter boy's name:");
            String boy_name = scan.next();

            System.out.print("Enter girl's name:");
            String girl_name = scan.next();

            char first1_letter = boy_name.charAt(0);
            char first2_letter = girl_name.charAt(0);

            if(first1_letter < first2_letter){
                System.out.print("Definitely Marry");
            }
            else{
                System.out.print("maybe");
            }
        } else if (boy_age == girl_age) {
            System.out.print("think twice");

        }else{
            System.out.print("Can't marry");
        }



    }
}

//take your name and age as user input
// 10 girls can insert their name and age in 10 items
//  the ascii value of the first letter of your name shound less than or equals to any girl's ascii value(first letter of the name)
// and age shound less than your age display match


import java.util.Scanner;
public class MatchingApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter user's name:");
        String name = scan.next();
        System.out.print("Enter user's age:");
        int age = scan.nextInt();

        char first_letter = name.charAt(0);
        boolean success = false;

        for(int i=0;i<10;i++){
            System.out.print("Enter girl's name:");
            String girl_name = scan.next();
            System.out.print("Enter your age:");
            int girl_age = scan.nextInt();
            char girl_f_letter = girl_name.charAt(0);

            if(first_letter<=girl_f_letter && girl_age<age){
                System.out.println("match");
                success = true;
                break;
            }

            else{
                System.out.println("not match");

            }

        }

        if(!success){
            System.out.println("sorry! not match");
        }


    }
}

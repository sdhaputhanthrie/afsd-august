import java.util.Scanner;
public class Demo10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scan.next();
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        System.out.print("Are your married or not?");
        boolean status = scan.nextBoolean();

        if(age<18){
            System.out.println(" ineligible to vote");
        }
        else{
            char first_letter = name.charAt(0);
            int name1 =  first_letter;
            if (first_letter>70 && status){
                System.out.println(" you are eligible to vote");

            }
            else{
                System.out.println("you can't vote");
            }
        }
    }
}

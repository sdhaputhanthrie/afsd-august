import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter boy's name:");
        String boy_name = scan.next();

        System.out.print("Enter girl's name:");
        String girl_name = scan.next();

        char first_letter = boy_name.charAt(0);
        char last_letter = girl_name.charAt(girl_name.length()-1);

        int name1 = first_letter;
        int name2 = last_letter;

        System.out.println("Lucky number is:"+ ((name1 + name2))/2);







    }
}

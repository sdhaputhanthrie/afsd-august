import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scan.nextInt();

        if(age<=13){
            System.out.println("Your are child");
        } else if (age<=18) {
            System.out.println("Your are teenager");

        } else if (age<40) {
            System.out.println("your are younger");
        }
        else{
            System.out.println("Your are adult");
        }
    }
}

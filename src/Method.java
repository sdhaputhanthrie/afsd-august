import java.util.Scanner;
public class Method {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println("Hello");
        }
        get_total();
        get_total();
        check_value();
    }
    //method
    //void - return type
    //get_total - method name (getTotal,get_total)
    public static void get_total(){
        System.out.println("hello sanadee");
    }

    public static void check_value(){
      Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scan.nextInt();

        if(number%2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number ia odd");
        }
    }
}

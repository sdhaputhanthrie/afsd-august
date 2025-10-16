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
        check_value2(12); // 12 - argument1
        String name = find_odd_even(16); // return method

    }
    //method
    //void - return type
    //get_total - method name (getTotal,get_total)
    public static void get_total(){
        System.out.println("hello sanadee");
    }

    // normal method
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
    // parameterized method
    //()parameter bracket
    public static void check_value2(int number){
        if(number%2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number ia odd");
        }
    }
    //return method
    public static String find_odd_even(int num){
        if(num % 2 == 0){
            return "Even";
        }else{
            return "odd";
        }
    }
    }


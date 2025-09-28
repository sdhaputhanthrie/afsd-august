import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String dbEmail= "admin@gmail.com";
        int dbPassword= 12345;

        for (int i=1; i<=5; i++) {
            System.out.print("Enter your email:");
            String email = scan.next();
            System.out.print("Enter your password:");
            int password = scan.nextInt();
            if (i == 5) {
                System.out.println("Account locked");
            }

            if (email.equals(dbEmail) && dbPassword == password) {
                System.out.println("login success");

                System.out.print("Enter your name:");
                String name = scan.next();
                System.out.print("enter your age:");
                int age = scan.nextInt();
                System.out.print("enter your lagana");
                String lagana = scan.next();


                if(age<18){
                    System.out.println("age is not enough");
                }
                else{
                    char first_letter = name.charAt(0);
                    String lucky;


                    if(first_letter%2==1){
                       lucky= "වාසනාවන්තයෙකි";
                    }
                    else {
                        lucky ="අවාසනාවන්තයෙකි";
                    }
                }
                String result;
                switch(lagana){
                    case "Aries":
                        result = "යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.";
                        break;
                    case "taurus":
                        result = "අන් අයගේ සිත් දිනා ගනී";
                        break;
                    case "gemini":
                        result="අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                        break;
                    case "cancer":
                        result="වස්තුව සහ සැප සම්පත් ලඟා වේ";
                        break;
                    case "lion":
                        result="දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම";
                        break;
                    default:
                        result="ඔබේ ලග්නය වැරදී";
                }



            } else {
                System.out.println("login failed");
            }


        }

    }
}

import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = 5;//single
        int num = 10;
        System.out.println(age);

        int[]ages = new int[10];
        ages[3] = 54;
        ages[2] =90;
        ages[1] =89;

         //
        System.out.println(ages[0]);
        for(int i=0;i<10;i++){
            System.out.println(ages[i]);
        }
        for(int i=0;i<10;i++){
            ages[i]=scan.nextInt();
        }
    }
}

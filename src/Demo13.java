//get 9 students term test mark and subject user input
//find max mark subject name
//get marks avgerage
import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[]mark = new int[9];
        String[]subject_name = new String[9];
        for(int i =0; i<9; i++) {

            System.out.print("Enter your subject name:");
            subject_name[i]= scan.next();


            System.out.print("Enter your last term test marks:");
            mark[i]=scan.nextInt();
        }
        int max_mark = 0;
        int position = 0;
        for(int i =0; i<9; i++ ){
            if (mark[i]>max_mark) {
               max_mark=mark[i];
               position = i;


            }
            System.out.println("max marked subject name is "+ subject_name[position]);

            }
        double total_mark=0;
        for(int i=0;i<9;i++){
            total_mark += mark[i];

        }
        System.out.println("Average is "+ (total_mark/9));
        }

    }


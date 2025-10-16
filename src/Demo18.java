import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] name = new String[15];
        int[][] mark = new int[15][6];
         for (int i =0; i<15; i++) {
             System.out.print("Enter your name:");
             name[i] = scan.next();
             for (int j = 0; j < 6; j++) {
                 System.out.print("Enter your mark:");
                 mark[i][j] = scan.nextInt();
             }
         }
        int[] ar =  find_total(mark);
         int[] ar_avg = find_avg(ar);

    }
    public static int[] find_total ( int[][] mark) {
        int[] total = new int[15];
         for (int i=0; i<15; i++){
             int sum=0 ;
             for (int j=0; j<6; j++){
                 sum += mark[i][j];
             }
             total[i] = sum;
         }
         return total;
    }

    public static int[] find_avg (int[] ar){
        int[] avg = new int[6];
        for(int i=0;i<15;i++){
            for (int j=0; j<6; j++){
                 avg[i] = ar[i]/6;
            }
        }
        return avg;
    }
    public static String find_max (int[] ar, String[] name){
        String max_student = "";
        int max_mark =0;
        int position = 0;
        for(int i=0;i<15;i++){
            for (int j=0; j<6; j++){
                if(ar[i]>max_mark){
                    max_mark=ar[i];
                    position = i;
                }
                max_student=name[position];
            }


            System.out.println(ar[0]);

        }
        return max_student;
    }
}

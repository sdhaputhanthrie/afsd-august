import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[11];
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter your runs score:");
            score[i] = scan.nextInt();
        }
        int total_score = 0;
        for (int i = 0; i < 11; i++) {
            total_score += score[i];

        }
        System.out.println("Average is score:" + (total_score / 11));


        int max_score =score[0];
        for (int i =0;i<11;i++) {
            if (score[i] > max_score) {
                max_score = score[i];
            }
        }
        System.out.println("Highest score is:"+max_score);
        }
    }





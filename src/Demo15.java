//there are 5 departments in the office and there are 12 employees per department
// get department name and  employee salaries
// find the avg salary for a department
// find the name of max salaries department
import java.util.Scanner;
public class Demo15 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] dep_name=  new String[5];
        double[][] salary = new double[5][12];
        for(int i=0;i<5;i++){
            System.out.print("Enter your Department name:");
            dep_name[i] = scan.next();
            for(int j=0; j<12;j++){
                System.out.print("Enter your salary:");
                salary[i][j] = scan.nextDouble();
            }
        }

        for(int i=0;i<5;i++){
            double total =0.0;
            for (int j=0;j<12;j++){
               total += salary[i][j];
            }
            System.out.print("Avgerage salary of "+dep_name[i]+"is" + (total/12));

        }
        /*
       int max_salary_position =0;
        double max_salary = 0.0;
        for(int i=0; i<12;i++){
            max_salary += salary[0][i];
        }
        for(int i=0; i<5;i++){
            double total_salary =0.0;
            for(int j=0; j<12;j++){
                total_salary += salary[i][j];
                }
            System.out.println();
            }
            */
         double max_salary =0;
         int position =0;
         for(int i=0;i<5;i++){
             for(int j=0;j<12;j++){
                 if(max_salary< salary[i][j]){
                 position=i;
                 }
                 System.out.print("max salary "+dep_name[position]);
             }
         }
        }
    }



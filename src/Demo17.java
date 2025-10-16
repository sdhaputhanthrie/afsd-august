// store girl names & boy names separetely in proper way. create a method to find now many matching couples in the class
import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] boy_name = new String[17];
        String[] girl_name = new String[17];
        for(int i =0;i<17;i++){
            System.out.print("enter boy name:");
            boy_name[i]= scan.next();
            System.out.print("enter girl name:");
            girl_name[i] = scan.next();
        }
        matching_couple(boy_name,girl_name);
    }
    public static void matching_couple(String[] boy_name, String[] girl_name){
        int total=0;
        for (int i = 0; i < boy_name.length; i++) {
            char first_letter = boy_name[i].charAt(0);
            char last_letter = girl_name[i].charAt(girl_name[i].length()-1);

           if(first_letter> last_letter){
               total++;
           }

        }
        System.out.println("matching couple is "+total);

    }
}

package whileLoop;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int sayi;

        Scanner scanner = new Scanner(System.in);
        /*
        for(boolean run = true;run;){

            if(sayi<0){
                run = false;


            }


        }

         */

        System.out.println("-------------------------");

      do {
          System.out.print("sayi giriniz : ");
          sayi = scanner.nextInt();
      }while(sayi>0);
    }
}

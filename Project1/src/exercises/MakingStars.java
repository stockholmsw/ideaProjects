package exercises;
import java.util.Scanner;

public class MakingStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Making a triangle;

        for(int i = 0;i<10;i++){
                for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------------");

        for(int k = 0;k<10;k++){// Döngünün kaç kez çalişacağini belirler;
            for(int l = 10;l>k;l--){
                System.out.print("*");

            }
            System.out.println();

        }







    }
}

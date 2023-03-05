package whileLoop;
import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int k;
        while(i<=5){
            System.out.println(i);

            k= 1;
            while(k<=10){
                System.out.print(k + " ,");
                k++;
            }
            System.out.println();

            i++;

        }
    }
}

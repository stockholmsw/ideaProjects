package exercises;
import java.util.Scanner;

public class UdemyEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for(int i = 1;i<=10;i++){
            System.out.print(i);
            if(i!=10){
                System.out.print(",");
            }
        }










        // Carpim Tablosu;


        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                System.out.print( i + "*" + j + "=" + (i*j)+ " " );
            }
            System.out.println();
        }

    }
}

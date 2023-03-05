package whileLoop;
import java.util.Scanner;

public class IsPasswordCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 789456123;
        boolean isPasswordTrue = false;

        while(!isPasswordTrue){
            System.out.println("Sifreyi giriniz : " );
            password = scanner.nextInt();

            if(password==789456123){
                isPasswordTrue = true;
                System.out.println("Tebrikler , sifre dogru ");
            }else{
                System.out.println("Wrong code , do it again!");
            }

        }

        /*
        //do-while
        int i = 10;
        do{

            System.out.print(i + "_");
            i--;

        }while(i>0);



        int age=20;
        do
        {
            age++;
        }while(age<20);

        System.out.println(age);


         */


        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }

    }
}

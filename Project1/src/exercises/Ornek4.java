package exercises;
import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.


         */

        int sayi = 0;
        int sum = 0;
        while(sayi%2!=1){
            System.out.println("Sayi giriniz : ");
            sayi = scan.nextInt();
            if(sayi%2==0 &&sayi%4==0){
                sum+=sayi;
            }

        }
        System.out.println("Sayilarin toplami : " + sum);



    }



}


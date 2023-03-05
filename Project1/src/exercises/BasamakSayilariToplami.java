package exercises;
import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
          Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */


        System.out.print("Sayi giriniz :");
     int sayi = input.nextInt();
     int deger ;
     int toplam = 0;
     while(sayi!=0){
         deger = sayi%10;
         toplam+=deger;
         sayi/=10;
     }
        System.out.println("Girdiginiz sayinin basamak toplami : " + toplam);

    }
}

package exercises;
import java.util.Scanner;

public class SampleBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // UDEMY SORULAR
        //1-Klavyeden girilen n sayinin ortalamasini bulan kod;
        /*
        int sayiAl,sayiGir,toplamSayi = 0;
        double sayilarinOrtalamasi;
        int sayac = 0;
        System.out.println("Kac tane sayi girmek istiyosunuz : ");
        sayiAl = scan.nextInt();
        for(int i = 1;i<=sayiAl;i++){
            System.out.print( i + " .  sayi  : " );
            sayiGir = scan.nextInt();
            toplamSayi+=sayiGir;
            sayac++;
        }
        sayilarinOrtalamasi = (toplamSayi)/sayac;
        System.out.println("Girdiğiniz sayilarin ortalamasi : "  +sayilarinOrtalamasi);

         */


        // ADİNİ EKRANA 5 KEZ YAZDİRAN KODU TÜM DÖGÜLERLE YAPMA KODU
        /*
        System.out.println("Isminizi giriniz :");
         String ad = scan.nextLine();

         for(int i = 0;i<ad.length();i++){
             System.out.print(ad.charAt(i) + " ");
         }

        System.out.println("\n------------D-Ö-N-G-Ü-L-E-R--------------");





         int i = 0;
         while(i<ad.length()){
             System.out.print(ad.charAt(i) + " ");
             i++;

         }

         */

     String kelime = "Köksal";
     int measure = kelime.length()-1;
        System.out.println(measure);




    }
}

package exercises;
import java.util.Scanner;

public class Codingggg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Armstrong sayi coding;
        // Armstrong  SAYİ;
        /*
        Tüm basamaklarındaki rakamların sayı değerlerinin küpleri toplamı
        ,kendisine eşit olan sayılara "Armstrong sayı"denir.
        Örneğin; 371=33+73+13=27+343+1=371
         */


        int toplam = 0;
       int basamakSayisi = 0;
       int basamaktakiSayi ;
       int basamakUssu ;
       int sayi = 371;
       int geciciNumber;
       geciciNumber = sayi;
       while(geciciNumber!=0){
           geciciNumber/=10;
           basamakSayisi++;
       }
        System.out.println(sayi + " nin basamak değeri : " + basamakSayisi);


       geciciNumber = sayi;
       while(geciciNumber!=0){
           basamakUssu = 1;
           basamaktakiSayi= geciciNumber%10;
           for(int i = 1;i<=basamakSayisi;i++){
               basamakUssu*=basamaktakiSayi;
           }
           toplam+=basamakUssu;
           geciciNumber/=10;
           System.out.println(toplam);

       }


    }
}

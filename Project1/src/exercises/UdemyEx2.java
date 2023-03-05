package exercises;
import java.util.Scanner;

public class UdemyEx2 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        /*
        Sicak soğuk oyunu
        sistem 100 e kadar bir sayi üretir  , kullanici sayiyi tahmin eder ,Kullanicinin girdiği değere göre
        artir, azalt diye uyaralim, kullanici sayiyi bulana kadar tahmin istemeye devam et, bu sayi bulunduğunda
        kaç denemeden sonra bulduğumuzu belirtelim.
         */

        int produceNumber = (int)(Math.random()*100+1);
        int sayi;
        int kacDeneme = 0;

        do {
            System.out.println("Sayi tahmininizi yaziniz..");
            sayi = java.nextInt();
            if(sayi>produceNumber){
              ++kacDeneme;
                System.out.println("Sayiyi azalt!!!");
            }else if(sayi<produceNumber){
                System.out.println("Sayiyi artır!!!");
                ++kacDeneme;
            }
        }while (sayi!=produceNumber);

        if(sayi==produceNumber){
            System.out.println("Tebrikler sayiyi doğru tahmin ettiniz , congrats!!!!");
            System.out.println("Sayiyi " + (++kacDeneme) + " Denemede tahmin ettiniz...");
        }


    }
}

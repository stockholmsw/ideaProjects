package exercises;
import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*

ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.

18’in bölenleri : 1, 2, 3, 6, 9, 18

24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
         */

        // Ebob Bulma;
       // 18'in bolenleri;
        int sayi = 18;
        for(int i = 1;i<=sayi;i++){
            if(sayi%i==0){
                System.out.print( i + " , ");

            }

        }
        System.out.println();

        int sayi1,sayi2,ebob ;
        System.out.println("Sayi 1  :");
        sayi1 = scan.nextInt();
        System.out.println("Sayi 2 : ");
        sayi2 = scan.nextInt();
        ebob = sayi2;
        for(int i = 1;i<=sayi1;i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob = i;
            }
        }
        System.out.println(sayi1 + " ve " + sayi2 + " in Ebob sonucu : " + ebob );

        int ekok = (sayi2*sayi1)/ebob;
        System.out.println(sayi1 +          " ve " + sayi2 + " in EKOK sonucu : " + ekok);


        /*

 İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.

ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.

6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …

8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
         */













    }
}

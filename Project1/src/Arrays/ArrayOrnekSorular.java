package Arrays;
import java.util.Scanner;

public class ArrayOrnekSorular {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        /*
       1- n elemanli bir diziye dizinin indeksinin karesini atayan uygulama;

         */

        int eleman;
        System.out.println("Dizi indeksi kac elemanli olmalı?");
        eleman = array.nextInt();
        int elemanliDizi[] = new int[eleman];
        for (int i = 0; i < eleman; i++) {
            elemanliDizi[i] = i * i;
        }
        for (int i = 0; i < eleman; i++) {
            System.out.print(elemanliDizi[i] + " ");
        }

        System.out.println();
            /*
            Kullanicidan kac tane sayinin ortalamasini bulmasini istediğini sorun ve buna bağli olarak aldğiniz değerleri
            bir dizide saklayinn , veri alma işlemi bittiğinde , tüm sayilari ve ortalamasini ekrana yazdirin...
             */
            System.out.println("Kac tane sayinin ortalamasini bulmak istiyorsunuz ? ");
            int toplamNumber = 0;
            int howMany ;
            howMany = array.nextInt();
            int justArray[] = new int[howMany];
            for(int a = 0;a<howMany;a++){
                System.out.println("Sayi giriniz : \n");
                justArray[a] = array.nextInt();
                toplamNumber+=justArray[a];
            }
            double ortalama = (double) toplamNumber/howMany;
            System.out.println("Girdiğiniz sayilarin ortalamsi : " + ortalama);





    }
}




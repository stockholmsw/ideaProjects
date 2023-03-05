package exercises;
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
         kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        int sayi;
        int tekToplam = 0,ciftToplam = 0;
        do {
            System.out.println("Sayi giriniz :");
            sayi = scan.nextInt();
            if(sayi%2==1){
                tekToplam+=sayi;
            }else if(sayi%2==0){
                ciftToplam+=sayi;

            }
        }while(sayi>0);
        System.out.println("Teksayilarin toplami : " + tekToplam);
        System.out.println("Cift sayilarin toplami : " + ciftToplam);

    }
}

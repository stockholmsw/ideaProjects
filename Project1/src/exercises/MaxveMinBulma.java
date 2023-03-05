package exercises;
import java.util.Scanner;

public class MaxveMinBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
      Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22

         */

        int sayi,sayiGir,max = 0,min = 0;
        System.out.println("Kac tane sayi gireceksiniz ?");
        sayi = scan.nextInt();
        for(int i = 1;i<=sayi;i++) {
            System.out.print(i + "." + " sayıyı giriniz : ");
            sayiGir = scan.nextInt();
            if(i==1){
                min = sayiGir;
                max = sayiGir;
            }else{
                if(sayiGir>max){
                    max = sayiGir;
                }if(sayiGir<min){
                    min = sayiGir;

                }
            }
        }
        System.out.println("Girilen En buyuk deger : " + max);
        System.out.println("Girilen En kucuk deger : " + min);
    }
    }


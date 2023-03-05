package comparativeOperators;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Hesap Makinesi yapma
        int ilkSayi,ikinciSayi,secim;
        System.out.print("İlk sayiyi giriniz..");
        ilkSayi = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz..");
        ikinciSayi = scan.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-ModAlma");
        System.out.print("Seciminiz : ");
        secim = scan.nextInt();
        if(secim == 1){
            System.out.println("Islem Sonucu : " + ((ilkSayi + ikinciSayi)));
        }else if(secim==2){
            System.out.println("Islem Sonucu : " + ((ilkSayi - ikinciSayi)));
        } else if ( secim == 3) {
            System.out.println("Islem Sonucu :  " + ((ilkSayi*ikinciSayi)));

        } else if (secim==4) {
            if(ikinciSayi==0){
                System.out.println("ikinci sayi 0 olamaz!!!");
            }else if(ikinciSayi>0){
                System.out.println("Islem Sonucu : " + ((ilkSayi/ikinciSayi)));
            }else if(secim==5){
                System.out.println("Islem Sonucu  : " + ((ilkSayi&ikinciSayi)));
            }else{
                System.out.println("Programdan cikilmistir");
            }

        }

        System.out.println("Karar mekanizmasi Tamamlanmistir!!!!");
    }
    }



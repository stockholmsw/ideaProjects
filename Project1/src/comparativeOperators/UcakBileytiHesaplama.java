package comparativeOperators;
import java.util.Scanner;

public class UcakBileytiHesaplama {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int mesafe,yas,yolculukTipi;
        double biletFiyati,indirim;
        double gidisDonusIndirimFiyati;


        System.out.println("Mesafeyi KM olarak  giriniz : ");
        mesafe = java.nextInt();
        System.out.println("Yasinizi giriniz :");
        yas = java.nextInt();
        System.out.println("Yolculuk tipini giriniz : ");
        yolculukTipi = java.nextInt();

        biletFiyati = mesafe*0.10;






        if(mesafe>0&&yas>0 && yolculukTipi==1|| yolculukTipi==2){
            if(yas<12){
                indirim = biletFiyati-(biletFiyati*0.50);
                System.out.println("Indirimli bilet tutariniz : " + indirim);
                if(yolculukTipi==2){
                    gidisDonusIndirimFiyati= (indirim - (indirim*0.20))*2;
                    System.out.println("Gidis Donus Biletli indirim Tutariniz  : " + gidisDonusIndirimFiyati);
                }
            }else if (yas>12&&yas<=25){
                indirim = biletFiyati-(biletFiyati*0.10);
                System.out.println("Indirimli bilet Fiyatiniz : " + indirim);
                if(yolculukTipi==2){
                    gidisDonusIndirimFiyati = (indirim - (indirim*0.20))*2;
                    System.out.println("Gidis Donus Biletli indirim Tutariniz : " + gidisDonusIndirimFiyati);
                }
            } else if (yas>65) {
                indirim = biletFiyati-(biletFiyati*0.30);
                System.out.println("Indirimli bilet Fiyatiniz : " + indirim);
                if(yolculukTipi==2){
                    gidisDonusIndirimFiyati = (indirim - (indirim*0.20))*2;
                    System.out.println("Gidis Donus Biletli indirim Tutariniz : " + gidisDonusIndirimFiyati);

                }

            }

        }else{
            System.out.println("Hatali veri girdiniz..");
        }

    }

}

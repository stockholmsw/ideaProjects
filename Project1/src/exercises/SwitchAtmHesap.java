package exercises;
import java.util.Scanner;

public class SwitchAtmHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        kullaniciya bir secim yaptirdik , kullanici adi ve parola dogruysa sisteme başarili bir sekilde giris yapabilecek.
        yaptiktan sonra tercihine gore hangi islemleri yapmak istiyosa bir tercih tablosu gösterecek
        ve islemlerini yapcak;
         */

        int price, choice, rigt = 3, bakiye = 2500;
        String userName, code;

        while (rigt>0) {
            System.out.println("Kullanici adinizi giriniz.");
            userName = scan.nextLine();
            System.out.println("Sifrenizi giriniz .");
            code = scan.nextLine();
            while (userName.equals("LetsGoToSweden") && (code.equals("VolvoCar"))) {
                System.out.println("Kullanici adi ve sifre dogru \nSisteme giris yaptiniz..");
                System.out.println("Lutfen ne yapmak istediginizi seciniz  " + "\n1-Para Ekleme\n2-Para Cekme\n3-HesapSorgulama\n4-Hesaptan  Çikiş");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Para miktarini giriniz : ");
                        price = scan.nextInt();
                        bakiye += price;
                        System.out.println("Toplam Para Miktariniz : " + bakiye);
                        break;

                    case 2 :
                        System.out.println("Cekmek istediginiz Para Miktarini giriniz . ");
                        price = scan.nextInt();
                        if(price>bakiye){
                            System.out.println("Hesabinizdaki tutar yetersiz , Lutfen Dusunerek Para Çekimi yapiniz..");
                        }else{
                            System.out.println("Hesabinizdan Çekilen Para : "  +price);
                            bakiye-=price;
                            System.out.println("Hesabinizdaki Toplam Tutar : "+ bakiye);
                            break;
                        }


                    case 3 :
                        System.out.println("Hesabinizdaki Toplam Tutar : " + bakiye);
                        break;
                    case 4 :
                        System.out.println("Sistemden Çikiş Yaptiniz , Tekrar Görüşmek üzere!!");
                }

            }if(userName.equals("LetsGoToSweden")&&(code.equals("VolvoCar"))){

            }else{
                --rigt;
                System.out.println("Kullanici adi yada sifre yanliş , Tekrar deneyin");
            }if(rigt==0){
                System.out.println("Hesabiniz bloke olmuştur , bankayla iletişime geçiniz..");
            }else{
                System.out.println("Kalan Hakkiniz : " + rigt);
            }

    }
}
}


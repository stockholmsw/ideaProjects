package exercises;
import java.util.Scanner;

public class AtmAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1100;
        int kalanHak = 3;
        int secim;
        int price;
        String kullaniciAdi,sifre;

        while(kalanHak>0){
            System.out.print("Kullanici adini giriniz : ");
            kullaniciAdi = scan.nextLine();
            System.out.print("Sifreyi giriniz :");
            sifre = scan.nextLine();



            if(kullaniciAdi.equals("LearnJava")&& sifre.equals("LetsGoSweden")){
                System.out.println("Tebrikler Sisteme basariyla giris yapabilirsiniz!!!");
                System.out.println("MERHABALAR KODLUYORUZ BANKASİNA HOSGELDİNİZ!! ");

                do {  System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
                    System.out.println("1-Para Ekleme\n2-Para Cıkarma\n3-Bakiye Sorgulama\n4-Hesaptan Çikiş Yapma");
                     secim = scan.nextInt();
                    if(secim==1){
                        System.out.println("Eklemek istediginiz para miktarini giriniz.");
                        price = scan.nextInt();
                        bakiye+=price;
                    }else if(secim==2){
                        System.out.println("Cekmek istediginiz para miktarini giriniz");
                        price = scan.nextInt();
                        if(bakiye<price){
                            System.out.println("Yetersiz Miktar , Lutfen tekrar düşünerek işlem yapiniz..");
                        }else {
                            bakiye-=price;
                        }

                    } else if (secim==3) {
                        System.out.println("Hesanibizdaki tutar : " + bakiye);

                    }else{
                        System.out.println("Tekrar görüsmek üzere!!!!");
                    }


                }while(secim!=4);
                break;

            }else {
                kalanHak--;
                System.out.println("Lutfen tekrar deneyiniz\n Kullanici adi yada sifre yanlis");
            }if(kalanHak==0){
                System.out.println("Heabiniz bloke olmustur banka ile iletisime geciniz ");
            }else{
                System.out.println("Kalan hakkınız : " + kalanHak);
            }
        }

    }
}

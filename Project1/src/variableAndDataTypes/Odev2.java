package variableAndDataTypes;
import java.util.Scanner;


public class Odev2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV
tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */


        int price;
        double kdvOrani;
        System.out.print("Bir fiyat giriniz : ");
        price = scan.nextInt();
        kdvOrani = price<=1000?(price*0.18):(price*0.8);
        System.out.println("KDV'li tutar : " + (price + kdvOrani));
        System.out.println("Kdv tutari : " + kdvOrani);





        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
       Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
       𝑢 = (a+b+c) / 2
       Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
                */

        // Hipotenus Hesaplama ;
        int kisaKenar,uzunKenar,hipotenusK;
        System.out.print("Ucgenin kisaKenarini Giriniz : ");
        kisaKenar = scan.nextInt();
        System.out.print("Ucgenin UzunKenarini Giriniz : ");
        uzunKenar = scan.nextInt();


         hipotenusK = ((kisaKenar*kisaKenar) + (uzunKenar*uzunKenar));
        System.out.println("Ucgenin Hipotenusu : " +  (int)Math.pow(hipotenusK,0.5));









































    }
}

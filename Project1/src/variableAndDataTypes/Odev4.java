package variableAndDataTypes;
import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)
Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */


        System.out.println("Vucut Kitle Endeksini Hesaplama Merkezine Hosgeldiniz!!!!");;
        double kilo,endeks,boy;
        System.out.print("Boy'unuzu metre cinsinden giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        endeks = kilo/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz : " + endeks);



        /*

Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarın
ı ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
         */

        int kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;
        double armut,elma,domates,muz,patlican;
        double tutar ;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican =  5.0;

        System.out.print("Kac kg armut aldiniz : ");
        kgArmut = scan.nextInt();
        System.out.print("Kac kg elma aldiniz :  ");
        kgElma = scan.nextInt();
        System.out.print("Kac kg domates aldiniz : ");
        kgDomates = scan.nextInt();
        System.out.print("Kac kg muz aldiniz : ");
        kgMuz = scan.nextInt();
        System.out.print("Kac kg patlican aldiniz :");
        kgPatlican = scan.nextInt();
        tutar = ((kgElma*elma)+ (kgDomates*domates) +(kgArmut*armut) + (kgPatlican*patlican)+(kgMuz*muz));
        System.out.println("Toplam tutar : " + tutar);







































    }
}

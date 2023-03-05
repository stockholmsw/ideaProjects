package variableAndDataTypes;
import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir


         */

     double taksiMetre = 2.20,startPrice = 10;
     int km;
         System.out.println("KM: ");
         km = scan.nextInt();
        double price = km*taksiMetre;
        price+=startPrice;
        double taxPayment = price<=20?20d:price;
        System.out.println(taxPayment);





        /*
 Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        double pi = 3.14,cevre,alan;
        int yaricapi;
        System.out.print("Daire'nin yaricapini  giriniz:");
        yaricapi = scan.nextInt();
        cevre = 2*pi*yaricapi;
        alan = pi*yaricapi*yaricapi;
        System.out.println("Dairenin cevresi : " + cevre);
        System.out.println("Dairenin alani : " + alan);












    }
}

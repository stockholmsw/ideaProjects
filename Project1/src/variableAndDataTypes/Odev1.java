package variableAndDataTypes;
import  java.util.Scanner;
public class Odev1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer
kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti"
, küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...

         */


        int Matematik ,Fizik,Kimya,Turkce,Tarih,Muzik;

        System.out.print("Matematik notunuz : ");
        Matematik = scan.nextInt();
        System.out.print("Fizik Notunuz : ");
        Fizik = scan.nextInt();
        System.out.print("Kimya Notunuz : ");
        Kimya = scan.nextInt();
        System.out.print("Turkce Notunuz : ");
        Turkce = scan.nextInt();
        System.out.print("Tarih Notunuz : ");
        Tarih = scan.nextInt();
        System.out.print("Muzik notunuz : ");
        Muzik = scan.nextInt();

        double ortalama ;
        ortalama = (Matematik+Fizik+Kimya+Tarih+Turkce+Muzik)/6;
        String str = (ortalama>60)?"Sinifi Gecti":"Sinifta Kaldi";
        System.out.println("Ortalaniz : " + ortalama  + "\n" + str);


    }
}

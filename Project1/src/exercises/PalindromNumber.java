package exercises;
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //4004
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int tempNumber = sayi;
        int tersSayi = 0;
        int lastNumber;
        while(tempNumber!=0){
            System.out.println(">--------------------<<<");
            System.out.println("Sayi : " + tempNumber   );
            lastNumber = tempNumber%10;
            System.out.println("Son basamak : "+ lastNumber);
            tersSayi = (tersSayi*10) + lastNumber;
            System.out.println("Yeni sayi : "  +tersSayi);
            tempNumber/=10;
            System.out.println("Yeni Temp : " + tempNumber);

        }
        System.out.println("------------SAYİNİN TERSİ -----------------");
        System.out.println("Sayinin tersi : "  + tersSayi);

        if(sayi==tersSayi){
            System.out.println("Sayiniz : " + sayi + " Palindrom sayidir");
        }else{
            System.out.println("Sayiniz : " + sayi + " Palindrom sayi değildir.." );
        }

    }
}

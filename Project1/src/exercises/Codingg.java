package exercises;
import java.util.Scanner;

public class Codingg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        String kelime ;
        System.out.println("Kelime giriniz : ");
        kelime = scan.nextLine();
        int altSinir = 0;
        int ustSinir = kelime.length()-1;
        for(int i = ustSinir;i>=0;i--){
            System.out.print(kelime.charAt(i));

        }
        System.out.println();

         */
        System.out.println(">------------------------------------");
        //SAYININ TERSİ

        int sayi = scan.nextInt();
        String reversedNum = "";
        int basamakKalanSayi ;
        while(sayi!=0){
            basamakKalanSayi = sayi%10;
            reversedNum+=basamakKalanSayi;
            sayi/=10;
        }
        System.out.println(reversedNum);

    }

    }


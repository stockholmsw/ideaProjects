package com.koksalocal.math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-ÜsAlma\n" +
                "6-ModAlma\n" +
                "7-Faktöriyel\n" +
                "8-AsalSayi\n" +
                "9-Çıkış Yap";


        int tercih;
        boolean isTrue = true;
        while(isTrue){

            System.out.println(menu);
            System.out.println("Hangi islemi yapmak istiyorsunuz : ");



            tercih = scan.nextInt();

            System.out.println("1. sayi: ");
            int birinciSayi = scan.nextInt();
            System.out.println("İkinci sayi : ");
            int ikinciSayi = scan.nextInt();

            if(tercih==9){
                System.out.println(" sayi giriniz  :");
                birinciSayi = scan.nextInt();
                break;

            }


            switch (tercih){
                case 1 :
                    System.out.println(Math.toplamaIslemi(birinciSayi,ikinciSayi));
                    break;
                case 2 :
                    System.out.println(Math.cikarmaIslemi(birinciSayi,ikinciSayi));
                    break;
                case 3:
                    System.out.println(Math.carpmaIslemi(birinciSayi,ikinciSayi));
                    break;
                case 4 :
                    System.out.println(Math.bolmeIslemi(birinciSayi,ikinciSayi));
                    break;
                case 5 :
                    System.out.println(Math.usAlma(birinciSayi,ikinciSayi));
                    break;
                case 6 :
                    System.out.println(Math.modAlma(birinciSayi,ikinciSayi));
                    break;
                case 7 :
                    System.out.println(Math.faktoriyelIslemi(birinciSayi,ikinciSayi));
                    break;
                case 8 :
                    System.out.println(Math.isPrime(birinciSayi));
                    break;

                case 9 :
              //      System.out.println("Sistemden çıkış için "  + " [Q] VEYA [q] BASİNİZ") ;
               //     String harf = scan.next();
                    System.out.println("Sistemden Çikiş Yaptiniz");
                    isTrue = false;




            }

        }







    }
}

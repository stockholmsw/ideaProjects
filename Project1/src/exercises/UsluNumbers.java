package exercises;
import java.util.Scanner;

public class UsluNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int total = 1;
        for(int i = 1;i<=7;i++){
            total*=i;
            System.out.println( i + " :  faktoriyel sonucu : "  + total);
        }


         */
        // Kullanicinin girdigi degerler ile us hesaplama;

        int taban,us,multiplicate = 1;
        System.out.println("Uslu sayinin tabanini giriniz :");
        taban = input.nextInt();
        System.out.println("Uslu sayinin ussunu giriniz :");
        us = input.nextInt();
        for(int i = 1;i<=us;i++){
            multiplicate*=taban;
        }
        System.out.println("Girdiginiz uslu sayinin cevabi : " + multiplicate);
        /*
        multiplicate = 1
        taban = 2
        multiplicate = 1*2= 2 , 2*2=4,4*2=8,8*2=16;
         */

        int i = 1;
        while(i<=us){
            multiplicate*=taban;
            i++;
        }
        System.out.println(multiplicate);

    }
}











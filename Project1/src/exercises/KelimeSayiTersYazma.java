package exercises;
import java.util.Scanner;

public class KelimeSayiTersYazma {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        //Kelimenin Tersi;

        String letter;
        System.out.print("Bir kelime giriniz : ");
        letter = java.nextLine();
        for(int i = letter.length()-1;i>=0;i--){
            System.out.print(letter.charAt(i) + " ");

        }




        //Sayinin Tersi
        System.out.print("\nSayi giriniz : ");
        int modAalma ;
        String tersSayi = "";
     int sayi = java.nextInt();
     while(sayi>0){
         modAalma = sayi%10;
         tersSayi+=modAalma;
         sayi/=10;
     }
        System.out.println("Girdiğiniz sayinin tersi : " +tersSayi);







    }
}

package exercises;
import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

         */


        int average = 0;
        System.out.println("Sayi giriniz :");
        int number = scan.nextInt();
        for(int i = 0;i<number;i++){
            if(i%3==0&&i%4==0){
                average+=i;
            }
        }
        System.out.println("Girdiginiz sayilarin ortalamasi : " + average);



        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        System.out.println("Sayi giriniz : ");
        int sayi;
        sayi = scan.nextInt();
        for(int i = 0;i<sayi;i++){
            if(i%2==0){
                System.out.print(i + " , ");
            }
        }






    }
}

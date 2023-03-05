package exercises;
import java.util.Scanner;
public class HarmonikSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Java da girilen sayinin harmonik serisini bulan kodu yaz;
        // 1+(1/2)+(1/3)+(1/4)+(1/n);
        System.out.println("Sayi giriniz ");
        int sayi;
        double result = 0;
        sayi = scan.nextInt();
        for(int i = 1;i<=sayi;i++){
            result+=(1.0/i);

        }
        System.out.println(result);


    }
}

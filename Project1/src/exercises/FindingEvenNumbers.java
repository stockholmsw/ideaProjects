package exercises;
import java.util.Scanner;;

public class FindingEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program

        int sayi;
        System.out.println("Bir sayi giriniz : ");
        sayi = scanner.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            } else {
                continue;
            }


//          Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
//             3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.


            int number;
            int average = 0;
            System.out.print("Sayi giriniz :");
            number = scanner.nextInt();
            for (int n = 0; n <= number; n++) {
                if ((n % 3 == 0) && (n % 4 == 0)) {
                    average += n;
                }
            }
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + average);


        }
    }}



























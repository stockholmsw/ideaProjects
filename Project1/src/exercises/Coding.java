package exercises;
import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter;
        // Palindrom kelime kodu yaz.
        System.out.println("Bir kelime giriniz..");
        letter = scan.nextLine();
        boolean isPalindromWord = true;
        int lowLimit = 0;
        int upperLimit = letter.length() - 1;
        while (lowLimit < upperLimit) {
            if (letter.charAt(lowLimit) != letter.charAt(upperLimit)) {
                isPalindromWord = false;
            }
            lowLimit++;
            upperLimit--;
        }
        if (isPalindromWord) {
            System.out.println(letter + " Palindrom bir kelimedir..");
        } else {
            System.out.println(letter + " Palindrome bir kelime değildir...");
        }

        // PALİNDROM SAYİ

        int number;
        System.out.println("Sayi giriniz : ");
        number = scan.nextInt();
        int geciciSayi = number;
        int kalanSayi;
        int sayininTersi = 0;


        while (geciciSayi != 0) {
            System.out.println("<------------------------->");
            System.out.println("Girilen sayi : " + geciciSayi);
            kalanSayi = geciciSayi % 10;
            System.out.println("Basamaktan Kalan sayi : " + kalanSayi);
            sayininTersi = (sayininTersi * 10) + kalanSayi;
            System.out.println("Yeni sayi : " + sayininTersi);
            geciciSayi /= 10;
            System.out.println("Yeni Geçici sayi : " + geciciSayi);
        }
        if (sayininTersi == number) {
            System.out.println("Girilen sayi : " + number + " Palindrome sayidir");
        } else {
            System.out.println("Girilen sayi : " + number + " Palindrom sayi değildir.");
        }



    }
}

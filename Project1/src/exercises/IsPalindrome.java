package exercises;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kelimenin Palindrome olup olmadiğini bulan CODE;
        System.out.print("Kelimeyi giriniz :");
        String kelime = scan.nextLine();
        int altSinir = 0;
        int ustSinir = kelime.length()-1;
        boolean isPalindrome = true;
        while(altSinir<ustSinir){
            if(kelime.charAt(altSinir)!=kelime.charAt(ustSinir)){
                isPalindrome = false;
                break;
            }

            altSinir++;
            ustSinir--;

        }
        if(isPalindrome){
            System.out.println("Girdiğiniz " + kelime + " Kelimesi Palindrome ' dur");
        }else{
            System.out.println("Girdiğiniz " + kelime + " Kelimesi Palindrome Değildir.");
        }



    }
}

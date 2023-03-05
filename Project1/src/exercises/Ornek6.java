package exercises;
import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        // Verilen bir stringi ters yazma;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tersi yazilacak kelimeyi giriniz : ");
        String logo = scan.next();
        for(int i = logo.length()-1;i>=0;i--){
            System.out.print(logo.charAt(i));

        }



        for(int a=0;a<5;a++){
            // Döngünün beşkere dönmesini sağlayan döngü.
            // a bir tamsayı ve 0 değerine eşit.
            // Döngü a, 5'den küçük olduğu sürece döngü tekrar edecek.
            // a sayısı her tekrarda 1 arttırılacak.

            for(int b=0;b<=a;b++){
                // Kaçıncı satır ise o kadar dönen döngü.
                // Örneğin : ikinci satırda ikikere dönecek.
                // b bir tamsayı ve 0 değerine eşit.
                // Döngü b, a'ya eşit ya da a'dan küçük olduğu sürece döngü tekrar edecek.
                // b sayısı her tekrarda 1 arttırılacak.

                System.out.print("*");
                // Ekrana " * " işareti yazdırılacak.

            }
            System.out.print("\n");
// Yeni bir satıra geçilecek

        }
    }
}

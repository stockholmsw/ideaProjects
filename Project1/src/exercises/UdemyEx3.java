package exercises;
import java.util.Scanner;

public class UdemyEx3 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        /*
        Kullanicidan sürekli sayi alan  ve kullanici sifira bastiğinda girdiği sayilarin çarpimini sonuc olarak
        gösteren kodu yaziniz...
         */
        int sayi,carpimElemani = 1;


        do {
            System.out.print("Sayi giriniz : ");
            sayi = java.nextInt();
            if(sayi!=0){
                carpimElemani*=sayi;
            }else{
                break;
            }

        }while (sayi!=0);

        System.out.println("Girdiğiniz sayilarin Çarpimlari  :" + carpimElemani);

    }

}

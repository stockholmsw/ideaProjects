package exercises;
import java.util.Scanner;

public class LoopsEx {
    public static void main(String[] args) {
        /*
        Java döngüler ile cift bir değer girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz
         */
        Scanner scan = new Scanner(System.in);
        int sayi ;
        int toplam = 0;
        boolean isBiggerZero = true;
        while(isBiggerZero){
            System.out.println("Sayi giriniz : ");
            sayi = scan.nextInt();

            if(sayi%2!=0){
                toplam+=sayi;
            }
            else{
                isBiggerZero = false;
            }
        }
        System.out.println("Tek sayilarin toplami : " + toplam);







        }



    }


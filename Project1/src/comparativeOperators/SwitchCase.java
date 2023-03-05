package comparativeOperators;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 5;
        int ilk,son;
        System.out.println("Sisteme hos geldiniz..");
        System.out.println("Isleminizi belirtiniz...");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Mod");
        value = scan.nextInt();


        System.out.println("ilk sayiyi giriniz : ");
        ilk = scan.nextInt();
        System.out.println("son sayiyi giriniz :");
        son = scan.nextInt();
        switch(value){
            case 1:
                System.out.println("Islem sonucu : " + ((ilk +son)));
                break;
            case 2:
                System.out.println("Islem sonucu : " + ((ilk-son)));
                break;
            case 3 :
                System.out.println("Islem sonucu :" + ((ilk*son)));
                break;
            case 4 :
                if (son!=0){
                    System.out.println("Islem sonucu : " + ((ilk/son)));
                }else{
                    System.out.println("Sayiyi yanlis girdiniz..");
                }
                break;
            case  5:
                System.out.println("Islem sonucu : " + ((ilk%son)));
                break;

            default:
                System.out.println("Beceriksiz Mahlukat!");
        }


    }
}

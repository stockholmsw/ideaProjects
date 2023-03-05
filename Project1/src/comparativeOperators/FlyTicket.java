package comparativeOperators;
import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas;
        int i=0;
        double ucret,total;
        double indirim1, indirim2,indirim3;
        System.out.println("Mesafeyi Km Cinsinden Giriniz:");
        mesafe = input.nextInt();

        if( mesafe > 0){
            System.out.println("Yaşınızı Giriniz:");
            yas = input.nextInt();
            if(yas > 0){
                System.out.println("Yolculuk Tipini Giriniz:\n1:Tek Yön\n2:Gidiş-Dönüş");
                i = input.nextInt();
                if(i == 1){
                    if(yas <= 12){
                        ucret = mesafe * 0.10;
                        indirim1 = ucret - (ucret*0.50);
                        System.out.println("Toplam Tutar:" +indirim1);
                        System.out.print("TL");
                    }
                    else if(yas > 12 && yas <= 24 ){
                        ucret = mesafe * 0.10;
                        indirim1 = ucret - (ucret*0.10);
                        System.out.println("Toplam Tutar:" +indirim1);
                        System.out.print("TL");
                    }
                    else if(yas > 25 && yas <= 65){
                        ucret = mesafe * 0.10;
                        System.out.println("Toplam Tutar:" +ucret);
                        System.out.print("TL");
                    }
                    else{
                        ucret = mesafe * 0.10;
                        indirim1 = ucret - (ucret*0.30);
                        System.out.println("Toplam Tutar:" +indirim1);
                        System.out.print("TL");
                    }
                }
                else if(i == 2){
                    if(yas <= 12){
                        ucret = mesafe * 0.10;
                        indirim2 = ucret - (ucret*0.50);
                        indirim3 = indirim2 - (indirim2 * 0.20);
                        total = indirim3 * 2;
                        System.out.println("Toplam Tutar" +total);
                        System.out.print("TL");
                    }
                    else if(yas > 12 && yas <= 24 ){
                        ucret = mesafe * 0.10;
                        indirim2 = ucret - (ucret*0.10);
                        indirim3 = indirim2 - (indirim2 * 0.20);
                        total = indirim3 * 2;
                        System.out.println("Toplam Tutar:TL" +total);
                        System.out.print("TL");
                    }
                    else if(yas > 25 && yas <= 65){
                        ucret = mesafe * 0.10;
                        indirim2 = ucret - (ucret*0.20);
                        total = indirim2 * 2;
                        System.out.print("Toplam Tutar:" +total);
                        System.out.print("TL");
                    }
                    else{
                        ucret = mesafe * 0.10;
                        indirim2 = ucret - (ucret*0.30);
                        indirim3 = indirim2 - (indirim2*0.2);
                        total = indirim3 * 2;
                        System.out.println("Toplam Tutar:" +total);
                        System.out.print("TL");
                    }
                }
                else{
                    System.out.print("Yanlış Değer Girdiniz.");
                }
            }
            else{
                System.out.print("Yanlış Değer Girdiniz.");
            }
        }
        else{
            System.out.print("Yanlış Değer Girdiniz.");
        }
    }
}



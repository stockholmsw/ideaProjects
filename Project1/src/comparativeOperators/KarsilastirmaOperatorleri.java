package comparativeOperators;
import java.util.Scanner;



public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        boolean kosul1,kosul2,kosul3;
        kosul1 = (a>b)||(a!=c);
        kosul2 = (b+c)>(a+c);
        System.out.println(kosul1);
        System.out.println(kosul2);
        kosul3 = kosul1&&kosul2 || kosul2||kosul1;
        System.out.println(kosul3);

         */

        // IF - ELSE BLOKLARI

        int a = 1997 , b = 1978;
        boolean compare = a!=b;
        if(compare){
            a = 2023;
            System.out.println("a sayisi : " + a);
            System.out.println("a , b'ye esit degildir");

        }else{
            System.out.println("a ,b'ye esittir..");
        }

        System.out.println("Program tamamlanmistir...");

        int x = 10,y = 16,z=0;
        if((x!=y) && (x>z)){
            System.out.println("x en buyuk sayidir.");
        }else if(z<x){
            System.out.println("ikinci if de calisti...");
        }


        int bir,iki;
        bir = 12;
        iki = 44;
        if(bir!=iki)
            if(bir<iki)
                if(bir==iki){
                    System.out.println("ic ice if boyle olusturulur!!");
                }else{
                    System.out.println("Kodlama'yi seviyorum");
                }
        System.out.println("PROGRAMME HAS BEET CALLED OFF!");












    }
}

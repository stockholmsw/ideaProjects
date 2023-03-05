package Arrays;

public class MetotlaraDiziGondermek {
    public static void main(String[] args) {
        int sayilar[] = {1,2,3,4,5};
        diziGoster(sayilar);
       // System.out.println("Metotdan önce index 0 : " + sayilar[0]);
        degeriBirArtir(sayilar[0]);
      //  System.out.println("Metot dan sonra index 0 : " + sayilar[0]);
        diziDegerleriniBirArtir(sayilar);

        System.out.println("Dizi değerlerini artirmadan önce");
        diziGoster(sayilar);
        diziDegerleriniBirArtir(sayilar);
        System.out.println("Dizi değerlerini artirdiktan sonra ");
        diziGoster(sayilar);
    }

    private static void diziDegerleriniBirArtir(int[] sayilar) {
     sayilar[0]++;
     sayilar[0]++;
     sayilar[0]++;
    }

    private static void degeriBirArtir(int i) {

        i++;
    }

    private static void diziGoster(int[] rakamlar) {
        for(int s :rakamlar){
            System.out.println(s);
        }
    }
}

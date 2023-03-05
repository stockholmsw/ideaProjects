package Arrays;

public class IkiBoyutluDizi {
    public static void main(String[] args) {

        /*
        100 elemanli bir dizi olustur ve elemanlari rastgele üret
        ve dizideki elemanlarin ortalamasini hesapla
        ortalamanin altinda kaç tane dizi olduğunu yazdir
         */

        int kacSayi = 0;
        int  sayilarinToplami = 0;

        int dizi[] = new int[100];
        for(int i = 0;i< dizi.length;i++) {
            int rastgeleSayilar = (int)(Math.random()*101);
            dizi[i] = rastgeleSayilar;
            sayilarinToplami += dizi[i];

        }

        for(int i = 0;i< dizi.length;i++){
            System.out.print(dizi[i] + " ");
        }
        System.out.println("*************************************");
        double sayilarinOrtalamsi = (double)sayilarinToplami/ dizi.length;
        for(int i = 0;i< dizi.length;i++){
            if(dizi[i]<sayilarinOrtalamsi){
                System.out.println ("Ortalamin altinda kalan sayilar  : " + dizi[i]);
                kacSayi++;
            }

        }
        System.out.println();
        System.out.println("Ortalama : " + sayilarinOrtalamsi + "\n Ortalamanin altinda kalan sayi miktari : " + kacSayi);






    }
}

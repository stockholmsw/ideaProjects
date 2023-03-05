package Arrays;public class Vargs {
    public static void main(String[] args) {
        cokDiziler(12,16,28,65,53);

        int asilDizi[] = {13,26,35,23,22,10};
        int kopyalananDizi[] = new int[asilDizi.length];
        for(int i = 0;i< asilDizi.length;i++){
            kopyalananDizi[i] = asilDizi[i];
        }
        for(int kopyaliDizi : kopyalananDizi){
            System.out.println("Kopyalanan dizinini elemanlari : " + kopyaliDizi);
        }

        String isimliDizi[] ={"Köksal","Gamze","Tülay","Rıza","Inci"};
        String bosIsim[] = new String[ isimliDizi.length];
        for(int i = 0;i<isimliDizi.length;i++){
            bosIsim[i] = isimliDizi[i];
        }

        for(String oankiIsim:bosIsim){
            System.out.println(oankiIsim);
            System.out.println(isimliDizi);
        }

    }
    public static void cokDiziler(int ...diziler){
        int diziToplam = 0;
        for(int i : diziler){
            diziToplam+=i;
        }
        System.out.println("Dizinin ilk elemani : " + diziler[0]);
        System.out.println("Dizilerin Toplami : " + diziToplam);



    }
}

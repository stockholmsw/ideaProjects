package Methodlar;

public class MethodKavrami {
    public static void main(String[] args) {
        // UslüSayi;
        int taban =6;
        int us = 4;
        int multiplicative = 1;
        for(int i = 1;i<=us;i++){
            multiplicative*=taban;
        }
        System.out.println(multiplicative);
        int case1 = usluSayi(7,4);
        System.out.println(case1);


    }
    public static int  usluSayi(int base,int exp) {
        int carpim = 1;
        for (int i = 1; i <= exp; i++) {

            carpim *= base;
        }
        return carpim;



    }

}

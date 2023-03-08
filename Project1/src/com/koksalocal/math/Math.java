package com.koksalocal.math;
import java.util.Scanner;

public class Math {
    public static int toplamaIslemi(int a , int b ){
        int result = a+b;
        return result;
    }public static int cikarmaIslemi(int a , int b){
        int result;
       if(a<b){
           System.out.println("Negatif sayi istemiyoruz\nMoral bozuoo");
       }
        result = a-b;
       return result;


    }

    public static int carpmaIslemi(int a , int b){
        int result = a*b;
        return result;

    }
    public static int bolmeIslemi(int a , int b) {
        if (b == 0) {
            System.out.println("Bölen 0 olamaz , tekrar islem yapiniz ");
            return 0;
        }

        int result = a/b;
        return  result;
    }
    public static int usAlma(int taban,int us){
        int carpan = 1;
        for(int i = 1;i<=us;i++){
            carpan*=taban;
        }
        System.out.println(taban + " üs " + us + " : " + carpan);
        return  carpan;
    }
    public static int modAlma(int a , int b){
        int result = a%b;
        return result;
    }
    public static int faktoriyelIslemi(int carpan , int eKadar){
        carpan =1;
        for(int i = 1;i<=eKadar;i++){
            carpan*=i;
        }
        System.out.println(eKadar +  " Faktöriyeli : " + carpan);

        return carpan;
    }

    public static boolean isPrime (int num){
        for(int i = 2;i<100;i++){
            if(num%i==0){
                return  false;
            }
        }
        return  true;
    }
}

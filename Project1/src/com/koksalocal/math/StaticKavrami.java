package com.koksalocal.math;

public class StaticKavrami {
    public static void main(String[] args) {
        Memur m1 = new Memur();
        m1.setIsim("Köksal");
        m1.setMaas(27560);
        Memur m2 = new Memur();
        m2.setIsim("Gamze");
        m2.setMaas(27560);
        Memur m3 = new Memur();
        m3.setIsim("Tolga");
        m3.setMaas(27560);
        m3.bilgileriGoster();

        System.out.println("Olusturulan memur sayisi m1 : " + m1.olusturulanMemurNesnesi);
        System.out.println("Olusturulan memur sayisi m2: " + m2.olusturulanMemurNesnesi);
        System.out.println("Olusturulan memur sayisi m3 : " + m3.olusturulanMemurNesnesi);
        System.out.println("Nesne Sayisi Sınıf Memur : " + Memur.olusturulanMemurNesnesi);

        System.out.println("***********************************************");

        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();

        Memur.kanunuSoyle();


    }
}

class Memur{
    private int maas;
   private  String isim;

   public static int olusturulanMemurNesnesi;

   public Memur(){
       olusturulanMemurNesnesi++;
   }

   public void setIsim(String isim){
       this.isim = isim;

   }

   public String getIsim(){
       return isim;
   }

   public void setMaas(int payMent){
       if(maas<0){
           maas = 0;
       }else{
           this.maas = payMent;
       }

   }
   public int getMaas(){
       return  maas;
   }

   public void bilgileriGoster(){
       System.out.println("Olusturulan Memur Nesnesi Sayisi : " + olusturulanMemurNesnesi);
       kanunuSoyle();
   }

   public static void kanunuSoyle(){
       System.out.println("I will Learn Fucking Java Programming");
   }
}

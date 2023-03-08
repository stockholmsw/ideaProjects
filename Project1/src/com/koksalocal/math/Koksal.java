package com.koksalocal.math;

public class Koksal {
    /*

    Koksal sınıfına ait olusturulacak nesnelerin özellikleri;
     */
     private int no ;
    private String gozRengi;
    private boolean aktif;
    private String isim;
    private int yas;

    public int getNo() {
        return no;
    }

    public void setNo(int numara){
        this.no = numara;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
        aktif = true;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Koksal(){
        aktif = true;
        System.out.println("Constructor methodu oluşturuldu");
    }

    public Koksal(int yas){
        this.yas = yas;

    }
    public Koksal(int yas , String isim){
        this(yas);
        this.isim = isim;
    }

    public Koksal(int yas,String isim,String gozRengi){
        this(yas,isim);
        this.gozRengi = gozRengi;

    }
    public Koksal(int yas,String isim,String gozRengi , int no ){
        this(yas,isim,gozRengi);
        this.no = no;
    }
    public Koksal(int yas , String isim,String gozRengi,int no,boolean aktif){
        this(yas,isim,gozRengi,no);
        this.aktif = aktif;
    }




    public void calistir(){
        if(aktif){
            System.out.println("isim : " +  isim + " Yaşım  :"  +yas +  " Göz rengim : " + gozRengi);
        }else{
            System.out.println("Keep Working");
        }


    }
}

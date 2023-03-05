package Arrays;

public class DiziYazdir {
    public static void main(String[] args) {
        String isimler[] = {"Köksal","Gamze","Isveç","Danimarka"};
        for(int i = 0;i< isimler.length;i++){
           // System.out.println(isimler[i]);
        }
        showArray(isimler);



    }
    public static void showArray(String dizi[]){
        for(String s:dizi){
            System.out.println(s);
        }
    }

}

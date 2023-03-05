package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int mainDizi[] = new int[]{1,2,3,6,9};
        int[] tersiOlusturulmusDizi = tersiOLusmusDizi(mainDizi);
       diziGoster(tersiOlusturulmusDizi );

    }
    public static int []tersiOLusmusDizi(int[]dizi ){
        int []reversedDizi = new int [dizi.length];
        for(int i = 0,j= dizi.length-1;i<dizi.length;i++,j--){
            reversedDizi[j] = dizi[i];
        }
        return  reversedDizi;
    }

    public static void diziGoster(int [] dizi){
        for(int i : dizi){
            System.out.println(i);
        }

    }



    }


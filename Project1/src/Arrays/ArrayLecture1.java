package Arrays;
import java.util.Scanner;
public class ArrayLecture1 {
    public static void main(String[] args) {
        /*
        int dizi1[] = {3,6,9,8,7,5};
        dizi1[2]= 3;
        for(int i = 0;i< dizi1.length-1;i++){
            System.out.println( i + " . " + " indeksteki eleman : " + dizi1[i]);
        }
        int [] dizi = new int[6];
        dizi[0] = 3;
        dizi[2] = 3;
        dizi[1] = 4;
        for(int i = 0;i< dizi.length-1;i++){
            System.out.println(dizi[i]);
        }

         */

        // For -each;

        /*
        int diziler[] = {1,2,3,4,5};
        for(int i = 0;i<diziler.length;i++){
            System.out.println(diziler[i]);
        }

        // for each;

        for(int i : diziler){
            System.out.println("Dizinin " + i + " inci elemai : " + i);
        }


         */


        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.print(elem +" ");
            }
            System.out.println();
        }

        //Dizideki Elemanların Max ve Min Değerlerini Bulan Program

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}




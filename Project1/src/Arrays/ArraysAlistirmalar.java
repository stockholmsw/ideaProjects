package Arrays;

public class ArraysAlistirmalar {
    public static void main(String[] args) {
        int[][] distances ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        // int [][] distances = new int[5][5];

       // System.out.println(distances.length); // row sayisi;
        // For döngüsünde dizilerin gösterimi

        for(int row = 0;row< distances.length;row++){
            for(int column = 0;column<distances[row].length;column++){
                System.out.print(distances[row][column] + "\t");
            }
            System.out.println();
        }
        System.out.println( " H-A-Y-I-R-L-I-K-O-D-L-A-R");

        System.out.println(distances[2][1]); // 490
        System.out.println(distances[4][3]); // 544
        System.out.println(distances[1][5]);// 439
        System.out.println(distances[2][4]);// 863

        System.out.println("K-E-E-P-C-O-D-I-N-G-------------------------------");




        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }


        /*
        Her bir elemani rastgele olusturulmus 3*2 lik bir matriste bulunan sayilarin toplamini yazdiran programi yaziniz
         bu matriste yer alan en kucuk ve en buyuk sayiyi mesaj olarak gostersin
         */

        int max = 0,min = 9500;
        int matrisToplamlari = 0;
        int randomMatris[][] = new int [3][2];
        for(int row = 0;row<randomMatris.length;row++){
            for(int col = 0;col<randomMatris[row].length;col++){
                randomMatris[row][col] = (int)(Math.random()*7);
                if(randomMatris[row][col]>max){
                    max = randomMatris[row][col];
                }
                if (randomMatris[row][col]<min) {
                    min = randomMatris[row][col];
                }
                System.out.println(row + " inci satirin " + col + " inci sütunundaki değerler : " + randomMatris[row][col]);
               //System.out.print(randomMatris[row][col] + " \t");
            }

            //System.out.println();
        }
        System.out.println("En büyük sayi : " + max);
        System.out.println("En küçük sayi : " + min);


        System.out.println("C-O-D-E-K-Ö-K-S-A-L");
        for(int row = 0;row< randomMatris.length;row++){
            for(int col = 0;col<randomMatris[row].length;col++){
                matrisToplamlari+=randomMatris[row][col];
            }
        }
        System.out.println("Iki boyutlu matrisin elemanlari toplamlari : " + matrisToplamlari);






        int sayi = (int)Math.random();
        double x = 12.5;
        int deger = Integer.MAX_VALUE;

















    }
}

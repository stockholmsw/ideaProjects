package Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {


            int firstArray [][] = {{12,24,36,45},{10,0,-6,-9,-2},{-13}};
            display(firstArray);

       /* İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.


       int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        */
        }

    public static void display(int[][] x){
        for(int row = 0 ;row<x.length;row++){
            for(int column = 0;column<x[row].length;column++ ){
                System.out.print(x[row][column] + " \t ");
            }
            System.out.println();
        }



    }
}
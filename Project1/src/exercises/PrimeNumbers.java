package exercises;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
       Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

Pozitif tam sayılar kümesinde bu şekilde kendisinden ve 1’den başka böleni olmayan birçok sayı vardır
. Bu özellikteki sayılara “asal sayı” denir. İlk on asal sayı 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 biçiminde sıralanır.
         */




       for(int i = 2;i<=100;i++){
           boolean isPrime = true;
           for(int j = 2;j<i;j++){
               if(i%j==0){
                   isPrime = false;
               }
           }
           if(isPrime){
               System.out.print( i + " ,");
           }

       }


    }
}



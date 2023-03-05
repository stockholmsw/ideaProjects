package exercises;

public class FibonacciNumbers {
    public static void main(String[] args) {


        int s1 = 0,s2= 1;
        int toplam ;

     for(int i = 1;i<=10;i++){
         System.out.print(s1 + " , ");
         toplam = s1+s2;// 0+1 = 1
         s1 = s2;//0=1 = 1
         s2 = toplam; //   1 =1
     }

    }

}


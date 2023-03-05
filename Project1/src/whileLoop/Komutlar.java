package whileLoop;

public class Komutlar {
    public static void main(String[] args) {
        /*
        for(int i =1; i<=6;i++)
        {
            if(i%3==0)
                continue;
            System.out.print(i+",");
        }


        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i);


            }
        }

         */

        int a = 1;
        while(a<=10){
            a++;
            if(a%2==0){
                continue;
            }
            System.out.println(a);



        }
    }


}
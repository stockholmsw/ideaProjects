package exercises;

public class Codinggg {
    public static void main(String[] args) {

        int a = 25689;
        int geciciSayi ;
        geciciSayi = a;
        int sayar = 0;
        System.out.println("Sayi : " + geciciSayi);
        while(geciciSayi!=0){
            geciciSayi/=10;
            System.out.println("<------------------------------->>");
            System.out.println("Yeni sayi : " + geciciSayi);
            sayar++;
        }
        System.out.println(a + " Sayisi " + sayar + " Basamaklidir.");


        System.out.println("------------------------------");
        //PERFECT NUMBER;
        /*
        Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
         sayının kendisinin iki katına eşittir. Bu tür sayılara “mükemmel sayı” denir.
         */

        int number = 45;
        int toplam = 0;
        // number ' in pozitif tambolenleri : 1,3,5,9,15,45;
        for(int i = 1;i<=45;i++){
            if(number%i==0){
                toplam+=i;
                System.out.print(i);
                if(i!=45){
                    System.out.print(" , ");
                }
            }

        }
        System.out.println();
        if(toplam - number == number){
            System.out.println(number + " Mükemmel bir sayidir ");
        }else{
            System.out.println(number + " Mükemmel bir sayi değildir!!");
        }









    }
}

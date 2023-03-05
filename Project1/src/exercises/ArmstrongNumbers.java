package exercises;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int basNum = 0;
        int tempNumber;
        int basValue;
        int basPow = 1;
        int result = 0;
        System.out.print("Sayi giriniz :");
        number = input.nextInt();

        tempNumber = number;
        while(tempNumber!=0){
        tempNumber/=10;
        basNum++;
      }
        tempNumber = number;
        while(tempNumber!=0){
            basValue = tempNumber%10;
            basPow = 1;
            for(int i = 1;i<=basNum;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }

        if(result==number){
            System.out.println("Girdiginiz sayi : " + number + " Armstrong Sayidir ");
        }else{
            System.out.println("Girdiginiz sayi : " + number + " Armstrong sayi degildir!!");
        }




    }
}

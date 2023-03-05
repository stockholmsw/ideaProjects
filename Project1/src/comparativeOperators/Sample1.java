package comparativeOperators;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*

        Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği
şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "
Şifre oluşturuldu" yazan programı yazınız.
         */



        Scanner input= new Scanner(System.in);
        String userName,password;
        System.out.println("Kulanıcı adını girin:");
        userName=input.nextLine();
        System.out.println("Şifreyi girin:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        } else if (userName.equals("patika")) {
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? Evet için 1 yazınız.");
            int check= input.nextInt();
            if (check==1){

                System.out.println("Yeni şifre giriniz:");

                Scanner newInput= new Scanner(System.in);
                String newPassword=newInput.nextLine();

                while (newPassword.equals(password))
                    if(newPassword.equals(password)){
                        System.out.println("Yanlış girdiğiniz şifreyi yeni şifreniz olarak atayamazsınız. Tekrar girin");
                        newPassword=newInput.nextLine();
                    }
                    else {
                        System.out.println("Şifre başarıyla değiştirildi.");
                    }
            }
            else {

            }
        } else {
            System.out.println("Hatalı giriş yaptınız ");
        }
    }
}
package Arrays;

public class DizilerinKopyalanmasi {

    public static void main(String[] args) {
        // Dizi Kopyalamak;

        int mainArray[] = new int [] {2,4,5,6,9};
        int copyArray[] = new int[mainArray.length];

        for(int i = 0;i< mainArray.length;i++){
            copyArray[i] = mainArray[i];
            System.out.println("CopyArray items : " + copyArray[i]);
        }


        int copyArray1 [] = new int[mainArray.length];
        System.arraycopy(mainArray,0,copyArray1,0,mainArray.length);
        for(int method : copyArray1){
           // System.out.println(method);

        }
        System.out.println("------------------------------- " );
        diziyiGoster(copyArray1);

    }
    public static void diziyiGoster(int [] yazdirilacakDizi){
        for(int methodDizi : yazdirilacakDizi){
            System.out.println(methodDizi);
        }

    }
}

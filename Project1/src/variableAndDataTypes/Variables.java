package variableAndDataTypes;
public class Variables {
    public static void main(String[] args) {
        int degisken = 1;
        degisken ++;
        degisken*=3;
        System.out.println(degisken);
        /*
        Java da kodlar yukaridan asağiya okunur , degisken isimlendirmelerinde camelCase kullanilir.
        degiskenIsmi , camelCase gibi;
         */

        int numberOne,numberTwo,numberThree = 0;
       numberOne = 5;
       numberTwo  = numberOne *numberThree; // 5*0 = 0;
        System.out.println(numberTwo);

        // char ;
        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';
        System.out.println("" + c1+c2+c3+c4);

        float ondalikliSayi = 12.8f;
        double sayi = 12;
        System.out.println(ondalikliSayi);
        System.out.println(sayi);

        byte value1 = Byte.MAX_VALUE;
        System.out.println(value1);
        short value2 = Short.MAX_VALUE;
        System.out.println(value2);
        int value3 = Integer.MAX_VALUE;
        System.out.println(value3);
        float value4 = Float.MAX_VALUE;
        System.out.println(value4);
        double value5 = Double.MAX_VALUE;
        System.out.println(value5);
        long value6 = Long.MAX_VALUE;
        System.out.println(value6);









        /*
        byte = 1 byte = 8bit
        short = 2 byte = 16 bit
        int = 4 byte = 32 bit
        double = 8 byte = 64bit
        float = 4 byte = 32 biy
        long = 8 byte = 64 bit
         */



    }
}

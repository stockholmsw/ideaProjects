package codingbat;

public class commonEnd {
    public static void main(String[] args) {

    }
    public boolean commonEnd(int[] a, int[] b) {
        /*

Given 2 arrays of ints, a and b, return true if they have the same first element // or
 they have the same last element. Both arrays will be length 1 or more.
         */

        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
            return  true;
        }
        return  false;
    }










}

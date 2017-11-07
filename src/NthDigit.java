/**
 * Created by stengali on 11/5/17.
 */
public class NthDigit {
    public static int findNthDigit(int n) {
        //999
        int len = 1;
        long count = 9;
        int start = 1;

        while(n>len*count){
            n -= len*count; //790
            len++; //3
            count *=10;// 1000
            start*=10;
        }

        start+=(n-1)/len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n-1)%len));

    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(999));
    }
}

package medium;

import java.util.Arrays;

/**
 * Created by stengali on 11/6/17.
 */
public class BeautifulArrangementII {

    public int[] constructArray(int n, int k) {

        int[] res = new int[n];
        int i=0,l=1,r=n;
        while(i<k){
            res[i++] = l++;
            if(i<k){
                res[i++] = r--;
            }
        }
        if(k%2==0){
            while(i<res.length) res[i++] = r--;
        } else {
            while(i<res.length) res[i++] = l++;
        }
        return res;
    }

    public static void main(String[] args) {
        BeautifulArrangementII obj = new BeautifulArrangementII();
        System.out.println(Arrays.toString(obj.constructArray(5,4)));
    }
}

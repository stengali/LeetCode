package hard;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by stengali on 1/19/18.
 */
public class KthSmallestPairDistance {

    public int smallestDistancePair(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                set.add(Math.abs(nums[i]-nums[j]));
            }
        }
        int res = -1;
        int j =0;
        for(int i: set) {
            if(++j == k){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        KthSmallestPairDistance obj = new KthSmallestPairDistance();
        System.out.println(obj.smallestDistancePair(new int[]{1,3,1},1));
    }
}

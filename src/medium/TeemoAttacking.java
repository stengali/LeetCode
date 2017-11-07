package medium;

/**
 * Created by stengali on 11/6/17.
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        if(timeSeries == null || timeSeries.length == 0 || duration == 0) return 0;
        int start = timeSeries[0];
        int end = timeSeries[0] + duration;
        for (int i=1;i<timeSeries.length;i++) {
            if(timeSeries[i] > end){
                res+= end - start;
                start = timeSeries[i];
            }
            end = timeSeries[i] + duration;
        }
        res += end - start;
        return res;
    }
    public static void main(String[] args) {
        TeemoAttacking obj = new TeemoAttacking();
        System.out.println(obj.findPoisonedDuration(new int[]{10,11,12},2));
    }
}

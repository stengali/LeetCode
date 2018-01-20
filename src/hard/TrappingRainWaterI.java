package hard;

/**
 * Created by stengali on 1/20/18.
 */
public class TrappingRainWaterI {

    public static int trapRainWater(int[] height) {
        int maxL = 0, maxR = 0, res = 0, l = 0, r = height.length-1;

        while (l<=r) {
            if (height[l]<=height[r]) {
                if (height[l] >= maxL) {
                    maxL = height[l];
                } else {
                    res += maxL - height[l];
                }
                l++;
            } else {
                if (height[r] >= maxR) {
                    maxR = height[r];
                } else {
                    res += maxR - height[r];
                }
                r--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TrappingRainWaterI obj = new TrappingRainWaterI();
        System.out.println(obj.trapRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

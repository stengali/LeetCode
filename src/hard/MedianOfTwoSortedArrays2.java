package hard;

import java.util.IllegalFormatException;

/**
 * Created by stengali on 1/21/18.
 */
public class MedianOfTwoSortedArrays2 {

    public double findMedianSortedArrays(int[] input1, int[] input2) {
        if(input2.length > input1.length ) {
            findMedianSortedArrays(input2, input1);
        }

        int x = input1.length;
        int y = input2.length;
        int formula = ( x+ y + 1 ) / 2;

        int low = 0;
        int high = x;

        while(low <= high) {
            int partitionX = ( low + high ) / 2;
            int partitionY = formula - partitionX;

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : input1[partitionX -1];
            int minRightX = partitionX == x ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : input2[partitionY -1];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if((x+y)%2 == 0) {
                  return (double)(Math.max(maxLeftX, maxLeftX)+Math.min(minRightX, minRightY))/2;
                } return (double) Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays2 obj = new MedianOfTwoSortedArrays2();
        System.out.println(obj.findMedianSortedArrays(new int[]{1,3,5,7,9}, new int[]{2,4,6,8,10}));
    }
}

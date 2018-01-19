package medium;

/**
 * Created by stengali on 1/19/18.
 */
public class ArrayNesting {

    public int arrayNesting(int []a) {
        int maxSize = 0;
        for(int i=0;i<a.length;i++) {
            int size = 0;
            int j=i;
            while(a[j] >= 0) {
                int temp = a[j];
                a[j] = -1;
                j = temp;
                size++;
            }
            maxSize = Math.max(maxSize, size);
        }
        return maxSize;
    }
    public static void main(String[] args) {
        ArrayNesting obj = new ArrayNesting();
        System.out.println(obj.arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
}

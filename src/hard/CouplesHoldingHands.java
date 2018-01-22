package hard;

/**
 * Created by stengali on 1/22/18.
 */
public class CouplesHoldingHands {

    public int minSwapsCouples(int[] row) {
        int []pos = new int[row.length];

        for(int i=0;i<row.length;i++) {
            pos[row[i]] = i;
        }
        int count = 0;
        for (int i=0;i<row.length;i++) {
            int j = row[i] % 2;
            j = j== 0 ? row[i] + 1 : row[i] - 1;
            if (row[i + 1] != j) {
                swap(row, pos, i + 1, pos[j]);
                count++;
            }
        }
        return count;
    }

    public void swap(int row[], int pos[], int x, int y) {
        int temp = row[x];
        pos[temp] = y;
        pos[row[y]] = x;
        row[x] = row[y];
        row[y] = temp;
    }
    public static void main(String[] args) {
        CouplesHoldingHands obj = new CouplesHoldingHands();
        System.out.println(obj.minSwapsCouples(new int[]{1,2,3,5,6,8,7,4,9,0}));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by stengali on 10/3/17.
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j) + row.get(j+1));
            }
            res.add(new ArrayList<Integer>(row));
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        for(List<Integer> a : res){
            System.out.println(Arrays.toString(a.toArray()));
        }
    }
}

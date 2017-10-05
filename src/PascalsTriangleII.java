import java.util.ArrayList;
import java.util.List;

/**
 * Created by stengali on 10/4/17.
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j) + row.get(j+1));
            }
        }
        return row;
    }
}

package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stengali on 1/24/18.
 */
public class FindAnagramMapping {

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<>();
        int res[] = new int[A.length];

        for(int i=0;i<B.length;i++) {
            map.put(B[i],i);
        }

        for(int i=0;i<A.length;i++) {
            res[i] = map.get(A[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        FindAnagramMapping obj = new FindAnagramMapping();
        System.out.println();
    }
}

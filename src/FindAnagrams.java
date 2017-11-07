import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by stengali on 11/4/17.
 */
public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int pLen = p.length();
        String pArr = charCount(p);
        for (int i=0;i<s.length()-pLen;i++) {
            if(charCount(s.substring(i,i+pLen)).equals(pArr)){
                res.add(i);
            }
        }
        return res;
    }

    public String charCount(String a) {


        char[] chars = a.toCharArray();
        Arrays.sort(chars);

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        FindAnagrams findAnagrams = new FindAnagrams();
        System.out.println(findAnagrams.findAnagrams("cbaebabacd","abc").toString());
    }
}

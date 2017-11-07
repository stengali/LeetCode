import java.util.HashMap;
import java.util.Map;

/**
 * Created by stengali on 11/5/17.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;
        Map index = new HashMap();

        for (int i=0;i<s.length();i++) {

            if (index.put(s.charAt(i), i) != index.put(t.charAt(i), i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings iso = new IsomorphicStrings();
        System.out.println(iso.isIsomorphic("a","a"));
    }
}

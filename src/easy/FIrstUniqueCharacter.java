package easy;

import java.util.Arrays;

/**
 * Created by stengali on 1/22/18.
 */
public class FIrstUniqueCharacter {

    public int firstUniqChar(String s) {
        int []c = new int[26];
        Arrays.fill(c, 0);
        int i = 0;
        for(char a: s.toCharArray()) {
            c[a-'a']++;
        }

        for(i=0;i<s.length();i++) {
            if(c[s.charAt(i)-'a'] ==  1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        FIrstUniqueCharacter obj = new FIrstUniqueCharacter();
        System.out.println();
    }
}

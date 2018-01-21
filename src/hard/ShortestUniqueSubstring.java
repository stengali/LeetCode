package hard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stengali on 1/21/18.
 */
public class ShortestUniqueSubstring {

    static String getShortestUniqueSubstring(char[] arr, String str) {
        if(arr == null || arr.length == 0 || str == null || str.length() ==0)
            return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : arr) {
            map.put(c,0);
        }

        for(char c: str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
        }

        for(char c: map.keySet()) {
            if(map.get(c) == 0)
                return "";
        }
        int i = 0;
        int j = str.length() -1;
        boolean checkI = true;
        boolean checkJ = false;
        while(i<=j) {
            if(checkI) {
                if(map.containsKey(str.charAt(i))) {
                    System.out.println(str.charAt(i));
                    if(map.get(str.charAt(i)) == 1) {
                        checkI = false;
                        checkJ = true;
                    }
                    else{
                        map.put(str.charAt(i),map.get(str.charAt(i) - 1));
                        i++;
                    }

                }  else {
                    i++;
                }
            }
            else if(checkJ) {
                if(map.containsKey(str.charAt(j))) {
                    if(map.get(str.charAt(j)) == 1){
                        checkJ = false;
                    }
                    else{
                        map.put(str.charAt(j),map.get(str.charAt(j) - 1));
                        j--;
                    }

                } else {
                    j--;
                }

            } else {
                break;
            }
        }

        return str.substring(i,j+1);
    }
    public static void main(String[] args) {
        ShortestUniqueSubstring obj = new ShortestUniqueSubstring();
        System.out.println();
    }
}

package hard;

import java.util.*;

/**
 * Created by stengali on 1/20/18.
 */
public class WordBreadII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }

    List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map) {
        if(map.containsKey(s))
            return map.get(s);

        LinkedList<String> res = new LinkedList<String>();
        if(s.length() == 0) {
            res.add("");
            return res;
        }

        for(String word : wordDict) {
            if(s.startsWith(word)) {
                List<String> subList = DFS(s.substring(word.length()), wordDict, map);
                for(String sub : subList) {
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }
        map.put(s,res);
        return res;
    }


    public static void main(String[] args) {
        WordBreadII obj = new WordBreadII();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("dog");
        wordDict.add("san");
        wordDict.add("ddog");
        List<String> res = obj.wordBreak("catsanddogs", wordDict);
        for(String r : res)
            System.out.println(r);

    }
}

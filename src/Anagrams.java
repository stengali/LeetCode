/**
 * Created by stengali on 10/15/17.
 */
public class Anagrams {
    public static void main(String[] args) {
        String a ="top";
        String b = "poat";
        int x = 0;
        for(char c:a.toCharArray()){
            x = x ^ c;
        }
        for(char c:b.toCharArray()){
            x = x ^ c;
        }
        if(x == 0)
            System.out.println("truee");
    }
}

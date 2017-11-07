import java.util.Stack;

/**
 * Created by stengali on 10/25/17.
 */
public class ParenthesisMatcher {
    public static void main(String[] args) {
        String str = "{{}}";
        Stack<Character> stack = new Stack<>();
        for(char a:str.toCharArray()) {
            if(a == '(')
                stack.push(a);
            else if(a == '{')
                stack.push(a);
            else if(a=='[')
                stack.push(a);
            else if(stack.isEmpty() || stack.pop() == a) {
                System.out.println("No match");
                break;
            }
        }
        System.out.println("Result -"+stack.isEmpty());
    }
}
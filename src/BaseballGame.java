import java.util.Stack;

/**
 * Created by stengali on 10/10/17.
 */
public class BaseballGame {
    public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(String op : ops){
            if(op.equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.peek();
                stack.push(temp1);
                stack.push(temp1 + temp2);
                sum += temp1 + temp2;
            }
            else if(op.equals("D")){
                int temp = stack.peek();
                sum += (temp + temp);
                stack.push(temp + temp);
            }
            else if(op.equals("C")){
                int temp = stack.pop();
                sum -= temp;
            }
            else{
                try{
                    stack.push(Integer.parseInt(op));
                    sum += stack.peek();
                }catch(Exception e){

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }
}

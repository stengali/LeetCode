package medium;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by stengali on 1/21/18.
 */
public class NestedListIterator implements Iterator<Integer> {

    Stack<Iterator<NestedInteger>> stack;
    NestedInteger nextInt;
    public NestedListIterator(List<NestedInteger> list) {
        stack = new Stack<Iterator<NestedInteger>>();
        stack.push(list.iterator());
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if(!stack.peek().hasNext()) {
                stack.pop();
            } else if ((nextInt = stack.peek().next()).isInteger()) {
                return true;
            } else {
                stack.push(nextInt.getList().iterator());
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        return nextInt != null ? nextInt.getInteger() : null;
    }
}

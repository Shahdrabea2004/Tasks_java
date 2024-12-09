import java.util.Stack;

public class CheckString {
    private String Arc;
    Stack<Character> stack = new Stack<>();
    public Stack<Character> getStack() {
        return stack;
    }

    public void setStack(Stack<Character> stack) {
        this.stack = stack;
    }

    public String getArc() {
        return Arc;
    }

    public void setArc(String Arc) {
        this.Arc=Arc;
    }
}
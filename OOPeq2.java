import java.util.Stack;

public class BracketValidator {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bracket string: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("True: Brackets are matched");
        } else {
            System.out.println("False: Brackets are not matched");
        }
    }
}

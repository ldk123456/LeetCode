import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    //有效的括号
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty()||stack.pop()!=c){
                return false;
            }

        }
        return stack.isEmpty();

    }
}

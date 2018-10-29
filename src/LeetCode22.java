import java.util.ArrayList;
import java.util.List;

/**
 * 生成括号
 */
public class LeetCode22 {
    public static void main(String[] args) {
        System.out.println(new LeetCode22().generateParenthesis(3));
    }

    /**
     * 由于字符串只有左括号和右括号两种字符，而且最终结果必定是左括号3个，右括号3个，
     * 所以我们定义两个变量left和right分别表示剩余左右括号的个数，
     * 如果在某次递归时，左括号的个数大于右括号的个数，
     * 说明此时生成的字符串中右括号的个数大于左括号的个数，即会出现')('这样的非法串，
     * 所以这种情况直接返回，不继续处理。
     * 如果left和right都为0，则说明此时生成的字符串已有3个左括号和3个右括号，且字符串合法，则存入结果中后返回。
     * 如果以上两种情况都不满足，若此时left大于0，则调用递归函数，注意参数的更新，
     * 若right大于0，则调用递归函数，同样要更新参数
     */
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        if (n<=0)
            return result;
        getParenthesis("", result, n, n);
        return result;
    }
    public void getParenthesis(String str, List<String> result, int left, int right){
        if (left>right)
            return;
        if (left==0&&right==0){
            result.add(str);
            return;
        }
        if (left>0){
            getParenthesis(str+"(", result, left-1, right);
        }
        if (right>0){
            getParenthesis(str+")", result, left, right-1);
        }
    }
}

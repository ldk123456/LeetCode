import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 */
public class LeetCode17 {
    public static void main(String[] args) {
        String s="45";
        System.out.println(new LeetCode17().letterCombinations(s));
    }
    /**
     * 比如输入1,2。对应的是abc,def。回先从a开始，然后flag+1，依次向下遍历def，
     * 然后依次向上返回返回ad,ae,af，并且添加到结果集中，然后再向上返回到i=0的循环
     * 然后i+1，从b开始，再依次向下遍历def，如同a一样，依次返回所有结果，
     * 当所有的遍历完之和，返回到letterCombinations中结束。
     */
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if (digits==null || digits.length()==0){
            return result;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char[] chars=new char[digits.length()];
        dfsGetStr(digits, map, 0, chars, result);
        return result;
    }
    private void dfsGetStr(String digits, String[] map, int index,
                           char[] chars, List<String> result){
        if (index==digits.length()){
            result.add(String.valueOf(chars));
            return;
        }
        char c=digits.charAt(index);
        String s=map[c-'0'];
        for (int i = 0; i < s.length(); i++) {
            chars[index]=s.charAt(i);
            dfsGetStr(digits, map, index+1, chars, result);
        }
    }
}

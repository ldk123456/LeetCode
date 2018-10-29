
import java.util.*;

/**
 * 字母异位词分组
 */
public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new LeetCode49().groupAnagrams(strs));
    }

    /**
     * 1.新建Map<String,List<String>>
     *
     * 2.遍历字符串数组里的每个字符串
     *   把每个字符串转化为字符数组，并对其进行排序
     *   排序后的字符数组转化为字符串，作为key，去查找并添加进Map<String,List<String>>
     *
     * 3.最后，输出Map<String,List<String>> 里的所有的value
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();

        for (String s : strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String str=String.valueOf(chars);
            if (!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

import java.util.*;

public class LeetCode387 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(firstUniqChar(s));
    }
    //字符串中的第一个唯一字符
    public static int firstUniqChar(String s) {
        int[] res=new int[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
           if(res[s.charAt(i)-'a']==1){
               return i;
           }
        }
        return -1;
    }
}

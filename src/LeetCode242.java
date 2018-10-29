import java.util.Arrays;
import java.util.Scanner;

public class LeetCode242 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String t=in.nextLine();
        System.out.println(isAnagram(s, t));
    }
    //有效的字母异位词
    public static boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if (s1.length!=t1.length){
            return false;
        }else{
            for(int i=0;i<s.length();i++){
                if(s1[i]!=t1[i]){
                    return false;
                }
            }
            return true;
        }
    }
}

import java.util.Scanner;

public class LeetCode28 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        System.out.println(strStr(s1, s2));
    }
    //实现strStr（）
    public static int strStr(String haystack, String needle) {
        int l1=haystack.length(),l2=needle.length();
        if(l1<l2) {
            return -1;
        }else if(l2==0) {
            return 0;
        }
        int threshold=l1-l2;
        for(int i=0; i<=threshold;i++) {
            if(haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

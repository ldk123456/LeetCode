
import java.util.Scanner;

public class LeetCode125 {
    public static void main(String[] args) {
        String s1="A man, a plan, a canal: Panama";
        String s2="race a car";
        System.out.println("A man, a plan, a canal: Panama :"+isPalindrome(s1));
        System.out.println("race a car :"+isPalindrome(s2));
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(isPalindrome(s));
    }
    //验证回文串
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex && startIndex < s.length() - 1) {
            char pre = s.charAt(startIndex);
            char aft = s.charAt(endIndex);
            if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
                startIndex++;
                continue;
            }
            if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
                endIndex--;
                continue;
            }
            if (pre != aft) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}

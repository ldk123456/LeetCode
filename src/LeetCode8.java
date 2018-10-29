import java.util.Scanner;

public class LeetCode8 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(myAtoi(s));
    }
    //字符串转整数 (atoi)
    public static int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() < 1) {
            return 0;
        }
        int i = 0;
        char flag = '+';
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        double res = 0;
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            res = res * 10 + str.charAt(i) - '0';
            i++;
        }
        if (flag == '-') res = -1 * res;
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}

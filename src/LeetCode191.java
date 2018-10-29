import java.util.Scanner;

public class LeetCode191 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(hammingWeight(n));
    }
    //位1的个数
    //你需要将n视为无符号值
    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}

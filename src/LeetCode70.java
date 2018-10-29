
import java.util.Scanner;

public class LeetCode70 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(climbStairs(n));
    }
    //爬楼梯
    public static int climbStairs(int n) {
        if(n==1||n==2) return n;
        int record[] = new int[n+1];
        record[1] = 1;
        record[2] = 2;
        for(int i=3;i<n+1;i++)
        record[i] = record[i-1]+record[i-2];
        return record[n];
    }
}

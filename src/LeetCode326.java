import java.util.Scanner;

public class LeetCode326 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isPowerOfThree(n));
    }
    //3的幂
    public static boolean isPowerOfThree(int n) {
        if (n==0)
            return false;
        if (n==1)
            return true;
        else{
            if (n%3==0)
                return isPowerOfThree(n/3);
            else
                return false;
        }
    }
}

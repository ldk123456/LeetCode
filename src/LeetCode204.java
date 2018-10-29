import java.util.Scanner;

public class LeetCode204 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(countPrimes(n));
    }
    // 计数质数
    public static int countPrimes(int n) {

        boolean[] prime=new boolean[n];

        int count=0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!prime[i]){
                for (int j=i*i;j<n;j+=i)
                    prime[j]=true;
            }
        }

        for (int i=2; i<n; i++){
            if (!prime[i])
                count++;
        }
        return count;
    }
}

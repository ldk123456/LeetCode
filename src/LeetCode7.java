
import java.util.Scanner;

public class LeetCode7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(reverse(n));
    }
    //反转整数
    public static int reverse(int x) {
        long r=0;
        while(x!=0){
            r=r*10+x%10;
            x=x/10;
        }
        if(r<-Math.pow(2,31)||r>Math.pow(2,31)){
            r=0;
        }
        return (int)r;
    }
}

import java.util.Scanner;

public class LeetCode38 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(countAndSay(n));
    }
    //报数
    public static String countAndSay(int n){
        String result="1";
        for (int i = 1; i < n; i++) {
            StringBuilder builder=new StringBuilder();
            int index=0;
            while (index<result.length()){
                char val=result.charAt(index);
                int count=0;
                while (index<result.length()&&val==result.charAt(index)){
                    index++;
                    count++;
                }
                builder.append(String.valueOf(count));
                builder.append(val);
            }
            result=builder.toString();
        }
        return result;
    }
}

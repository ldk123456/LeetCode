public class LeetCode344 {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(reverseString(s));
    }
    //反转字符串
    public static String reverseString(String s) {
        int n=s.length();
        char[] c=s.toCharArray();
        for(int i=0;i<n/2;i++){
            char t=c[i];
            c[i]=c[n-1-i];
            c[n-1-i]=t;
        }
        return new String(c);
    }
}


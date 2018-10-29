/**
 * 最长回文子串
 */
public class LeetCode5 {
    public static void main(String[] args) {
        System.out.println(new LeetCode5().longestPalindrome("cbbd"));
    }
    public String longestPalindrome(String s) {
        /**
         * 一、O(n^3)时间复杂度方法——暴力求解
         *
         * 思想：
         * 1）从最长的子串开始，遍历所有该原字符串的子串；
         * 2）每找出一个字符串，就判断该字符串是否为回文；
         * 3）子串为回文时，则找到了最长的回文子串，因此结束；反之，则继续遍历。
         */
        /*int length=s.length();   //字符串长度
        int maxLen=0;            //最长回文字符串长度
        int start=0;             //最长回文字符串起始地址
        for(int i=0;i<length;i++)//起始地址
            for(int j=i+1;j<length;j++)//结束地址
            {
                int tmp1,tmp2;
                for(tmp1=i,tmp2=j;tmp1<tmp2;tmp1++,tmp2--) {   //判断是不是回文
                    if(s.charAt(tmp1)!=s.charAt(tmp2))
                        break;
                }
                if(tmp1>=tmp2&&j-i>maxLen)
                {
                    maxLen=j-i+1;
                    start=i;
                }
            }
        if(maxLen>0)
            return s.substring(start,maxLen);//求子串
        return null;*/

        /**
         * 二、O(n^2)时间复杂度方法——从中心向外扩散
         *
         * 思想：
         * 1）将子串分为单核和双核的情况，单核即指子串长度为奇数，双核则为偶数；
         * 2）遍历每个除最后一个位置的字符index(字符位置)，
         *    单核：初始low = 初始high = index，low和high均不超过原字符串的下限和上限；
         *    判断low和high处的字符是否相等，相等则low++、high++（双核：初始high = 初始low+1 = index + 1）；
         * 3）每次low与high处的字符相等时，都将当前最长的回文子串长度与high-low+1比较。
         *    后者大时，将最长的回文子串改为low与high之间的；
         * 4）重复执行2）、3），直至high-low+1 等于原字符串长度或者遍历到最后一个字符，
         *    取当前截取到的回文子串，该子串即为最长的回文子串。
         */
            if(s.length()<2)
                return s;
            for(int i=0;i<s.length();i++){
                find(s,i,i);
                find(s,i,i+1);
            }
            return s.substring(start,start+maxLength);
        }
        private int start,maxLength;
        public void find(String s, int i, int j){
            while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            if(maxLength<j-i-1){
                start=i+1;
                maxLength=j-i-1;
            }
        }
}

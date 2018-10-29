public class LeetCode14 {
    public static void main(String[] args) {
        String[] str1={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str1));
    }
    //最长公共前缀
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        int min=Integer.MAX_VALUE;
        String minStr="";
        for(int i=0;i<strs.length;i++){
            if(min>strs[i].length()){
                minStr=strs[i];
                min=strs[i].length();
            }
        }
        if(min==0){
            return "";
        }
        for(int i=min;i>=0;i--){
            String standard=minStr.substring(0, i);
            int j;
            for(j=0;j<strs.length;j++){
                if(strs[j].substring(0, i).equals(standard)){
                    continue;
                }else{
                    break;
                }
            }
            if(j==strs.length){
                return standard;
            }
        }
        return "";
    }
}

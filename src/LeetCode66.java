
public class LeetCode66 {
    public static void main(String[] args) {
        int[] n=new int[]{9,9};
        int[] r=plusOne(n);
        for (int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
    //加一
    public static int[] plusOne(int[] digits) {
        int t=0;
        int[] result;
        for(int i=digits.length-1;i>=0;i--){
            int s;
            if(i==digits.length-1){
                s=digits[i]+1+t;
            }else {
                s=digits[i]+t;
            }
            digits[i]=s%10;
            t=s/10;
        }
        if(t>0){
            result=new int[digits.length+1];
            for(int i=0;i<result.length;i++){
                if(i==0){
                    result[i]=t;
                }else{
                    result[i]=digits[i-1];
                }
            }
        }else{
            result=digits;
        }
        return result;
    }
}

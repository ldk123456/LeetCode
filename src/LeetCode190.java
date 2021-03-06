public class LeetCode190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
    //颠倒二进制位
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }
}

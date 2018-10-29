public class LeetCode461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
    //汉明距离
    public static int hammingDistance(int x, int y) {
        int distance=0;
        int z=x^y;
        while (z!=0){
            z=z&(z-1);
            distance++;
        }
        return distance;
    }
}

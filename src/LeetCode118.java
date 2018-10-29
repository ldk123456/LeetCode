import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    //杨辉三角
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    List<Integer> last = result.get(i-1);
                    list.add(last.get(j-1)+last.get(j));
                }
            }
            result.add(list);
        }
        return result;
    }
}

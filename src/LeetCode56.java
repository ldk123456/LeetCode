import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 */
class Interval {
    int start;
    int end;
    Interval() {
        start = 0; end = 0;
    }
    Interval(int s, int e) {
        start = s; end = e;
    }
}
public class LeetCode56 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list=new ArrayList<>();
        if (intervals==null || intervals.size()==0)
            return list;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        Interval p=intervals.get(0);
        Interval temp;
        for (int i = 1; i < intervals.size(); i++) {
            temp=intervals.get(i);
            if (p.end>=temp.start){
                p.end=Math.max(p.end, temp.end);
            }else {
                list.add(p);
                p=temp;
            }
        }
        list.add(p);
        return list;
    }
}

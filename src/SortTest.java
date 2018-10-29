public class SortTest {
    //合并两个有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos=0;
        int[] res =  new int[nums1.length];
        int mPos = 0 , nPos = 0;
        while(mPos<m||nPos<n){
            if(mPos<m&&nPos<n){
                if(nums1[mPos]<=nums2[nPos]){
                    res[pos] = nums1[mPos];
                    pos++;
                    mPos++;
                }else{
                    res[pos] = nums2[nPos];
                    pos++;
                    nPos++;
                }
                continue;
            }
            if(mPos==m){
                res[pos]=nums2[nPos];
                pos++;
                nPos++;
                continue;
            }
            if(nPos==n){
                res[pos]=nums1[mPos];
                pos++;
                mPos++;
                continue;
            }
        }

        for(int i=0;i<m+n;i++){
            nums1[i]=res[i];
        }
    }
    //第一个错误的版本
    public int firstBadVersion(int n) {
        int min=1;
        int max=n;
        int mid=0;

        while(min<=max){
            mid=(min+max)/2;
            //mid为错误版本
            if(isBadVersion(mid)){
                max=mid-1;
            }else if(!isBadVersion(min)){
                min=mid+1;
            }
        }
        return min;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}

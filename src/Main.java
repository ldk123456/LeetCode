
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int startX=in.nextInt();
        int startY=in.nextInt();
        int endX=in.nextInt();
        int endY=in.nextInt();
        int count=dfs(startX,startY,endX,endY);
        System.out.println(count);
    }
    public static int dfs(int startX, int startY, int endX, int endY){
        if (startX<1||startY<1||startX>8||startY>8)
            return 1;
        if (startX==endX&&startY==endY)
            return 0;
        if (startX<endX&&startY<endY){
            return Math.min(dfs(startX+2,startY+1,endX,endY)+1,
                    dfs(startX+1,startY+2,endX,endY)+1);
        }
        if (startX<endX&&startY>endY){
            return Math.min(dfs(startX+2,startY-1,endX,endY)+1,
                    dfs(startX+1,startY-2,endX,endY)+1);
        }
        if (startX>endX&&startY<endY){
            return Math.min(dfs(startX-2,startY+1,endX,endY)+1,
                    dfs(startX-1,startY+2,endX,endY)+1);
        }
        if (startX>endX&&startY>endY) {
            return Math.min(dfs(startX-2,startY-1,endX,endY)+1,
                    dfs(startX-1,startY-2,endX,endY)+1);
        }
        if (startX==endX&&startY>endY){
            if (startY-endY==1){
                return 3;
            }else {
                return Math.min(Math.min(dfs(startX-2,startY-1,endX,endY)+1,
                        dfs(startX-1,startY-2,endX,endY)+1),
                        Math.min(dfs(startX+2,startY-1,endX,endY)+1,
                                dfs(startX+1,startY-2,endX,endY)+1));
            }
        }
        if (startX==endX&&startY<endY){
            if (endY-startY==1){
                return 3;
            }else {
                return Math.min(Math.min(dfs(startX-2,startY+1,endX,endY)+1,
                        dfs(startX-1,startY+2,endX,endY)+1),
                        Math.min(dfs(startX+2,startY+1,endX,endY)+1,
                                dfs(startX+1,startY+2,endX,endY)+1));
            }
        }
        if (startX<endX&&startY==endY){
            if (endX-endY==1){
                return 3;
            }else {
                return Math.min(Math.min(dfs(startX-2,startY-1,endX,endY)+1,
                        dfs(startX-1,startY-2,endX,endY)+1),
                        Math.min(dfs(startX-2,startY+1,endX,endY)+1,
                                dfs(startX-1,startY+2,endX,endY)+1));
            }
        }
        if (startX>endX&&startY==endY){
            if (endX-startX==1){
                return 3;
            }else {
                return Math.min(Math.min(dfs(startX+2,startY-1,endX,endY)+1,
                        dfs(startX+1,startY-2,endX,endY)+1),
                        Math.min(dfs(startX+2,startY+1,endX,endY)+1,
                                dfs(startX+1,startY+2,endX,endY)+1));
            }
        }
        return 1;
    }
}

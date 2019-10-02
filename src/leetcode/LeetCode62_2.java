package leetcode;
/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 问总共有多少条不同的路径？
 *
 *
 *
 * 例如，上图是一个7 x 3 的网格。有多少可能的路径？
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 * 示例 2:
 *
 * 输入: m = 7, n = 3
 * 输出: 28
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode62_2 {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        arr[0][0] =1;
        return paths(m,n,m,n,arr);
    }

    public int paths(int x, int y, int m ,int n, int[][] arr){
        if(x==1&&y==1){
            return arr[0][0];
        } else if(x==1&&y>1){
            if(arr[x-1][y-1]==0) {
                arr[x - 1][y - 1] = paths(x, y - 1, m, n, arr);
            }
            return arr[x-1][y-1];
        } else if(y==1&&x>1){
            if(arr[x-1][y-1]==0){
                arr[x-1][y-1] = paths(x-1,y,m,n,arr);
            }
            return arr[x-1][y-1];
        } else{
            if(arr[x-1][y-1]==0) {
                arr[x - 1][y - 1] = paths(x - 1, y, m, n, arr) + paths(x, y - 1, m, n, arr);
            }
            return arr[x-1][y-1];
        }
    }
}

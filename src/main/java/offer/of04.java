package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 18:13
 **/
public class of04 {
    public static void main(String[] args) {
        int[][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean numberIn2DArray = findNumberIn2DArray(a,20);
        System.out.println(numberIn2DArray);

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length -1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] < target){
                col++;
            }else if (matrix[row][col] > target) {
                row--;
            }else {
                return true;
            }


        }
        return false;


    }
}

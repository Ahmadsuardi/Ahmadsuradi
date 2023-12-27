import java.util.*;
public class MatrixArray {
    public static void main(String[] args) {
        int[][] M1 ={
            {7,1,1},
            {2,8,4},
            {8,7,9}
        };
        int[][] M2 ={
            {9,6,1},
            {7,8,6},
            {2,8,9}
        };
        int[][] jumlah = new int [M1.length][M1[0].length];
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[0].length; j++) {
                jumlah [i][j] = M1[i][j] * M2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(jumlah));
        
    }
}     

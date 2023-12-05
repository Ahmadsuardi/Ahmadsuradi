import java.util.Scanner;
public class HariKe58Array2D {
    public static void main(String[] args) {
       
        int [][] nilai = {
            {24,31,68},
            {55,83,99},
            {45,77,23}
                           
    };
        int max = 0;
        int min = 999;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++)  {
                if (max < nilai[i][j]) {
                    max = nilai[i][j];
                }
                if (min > nilai[i][j]) {
                    min = nilai[i][j];
                }
            }
        }
        System.out.println("terkecil : "+min);
        System.out.println("==========");
        System.out.println("terbesar : "+max);
    }
}

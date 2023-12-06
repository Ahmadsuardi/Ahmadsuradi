public class Array2Jml {
public static void main(String[] args) {
    int [][] angka = {
      {24,31,68},
      {55,83,99},
      {45,77,23}
    };
    int total = 0;
    for(int i = 0; i < angka.length; i++) {
    for(int j = 0; j < angka[i].length; j++){
    System.out.print(angka[i][j]+ " ");
    total += angka[i][j];
      }
    System.out.println(" ");
    }
    System.out.println("-------------");
    System.out.println("Hasil :"+total);
}
}

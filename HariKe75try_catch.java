public class HariKe75try {
public static void main(String[] args) {
        //jika angka 2 diganti dengan angka 0 maka  hasilnya adalah pembagian salah
      int x = 10, y = 2, z;
      try {
          z = x / y;
          System.out.println("hasil = "+z);
      }catch(Exception e){
          System.out.println("pembagian salah");
      }
    } 
}

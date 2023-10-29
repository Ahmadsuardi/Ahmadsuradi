import java.util.Scanner;
public class Harike21 {
    // Input nilai mahasiswa pada pemrograman java
    // NB : Rata rata diperoleh
    //*30% untuk Presensi, 30% untuk tugas dan 40% untuk UAS
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, matkul;
        double presensi, tugas, uas, rata2;
        
        System.out.println("INPUT NILAI MAHASISWA");
                    
        System.out.print("Masukkan Nama  : ");
        nama = input.nextLine();
         
        System.out.print("Masukkan NIM   : ");
        nim = input.nextLine();
         
        System.out.print("Mata Kuliah    : "); 
        matkul = input.nextLine();
         
        System.out.print("Nilai Presensi : ");
        presensi = input.nextDouble();
         
        System.out.print("Nilai Tugas    : ");
        tugas = input.nextDouble();
         
        System.out.print("Nilai UAS      : ");
        uas = input.nextDouble();
         
        rata2 = (0.30 * presensi + 0.30 * tugas + 0.40 * uas);
        System.out.println("Rata rata nilai anda adalah "+ rata2);
        

    }
}

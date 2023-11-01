import java.util.Scanner;
public class Hari24 {
public static void main(String[] args) {
    // Saya belajar menggunakan Scanner Perulangan for
    //Jika anda memasukan angka 1 samapa 10 maka program ini akan menghitung 1 sampai 10
        Scanner masuk = new  Scanner(System.in);
        int Start, finish;
        System.out.println("Masukkan angka");
        System.out.print("Angka : ");
        Start = masuk.nextInt();
        System.out.print("Sampai : ");
        finish = masuk.nextInt();
        
        for(int b = Start  ; b <= finish; b++){
        System.out.println(+b);
        }
        System.out.println("SELESAI");
    }    
}

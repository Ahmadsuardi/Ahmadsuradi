//Mencari angka genap
import java.util.Scanner;
public class Herike25 {
public static void main(String[] args) {
        Scanner masuk = new  Scanner(System.in);
        int awal, akhir
        System.out.println("angka genap ");
        System.out.print("awal : ");
        awal = masuk.nextInt();
        System.out.print("akhir : ");
        akhir = masuk.nextInt();
        if(awal < akhir){
            for(int b = awal; b <= akhir; b++){
            int hasil = b % 2;
            if(hasil == 0){
        System.out.print(b+" ");
            }
        }
        System.out.println("");
        }else{
            System.out.println("awal > akhir");
        }
    }    
}

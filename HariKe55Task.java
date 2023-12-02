import java.util.Scanner;
public class HariKe55Taskganjil {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        int angka = masuk.nextInt();
        System.out.println("Hasil : ");
        if(angka % 2 == 1){
            for (int i = 1; i <= angka; i += 2) {
                System.out.print(i);        
            }
        }else if(angka %2 == 0){
            
            System.out.println("\nSalah Memasukkan Angka");
        }
        System.out.println("");
    }
    
}

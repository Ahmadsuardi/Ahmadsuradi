//Hari Ke20 Switch case
import java.util.Scanner;
public class HariKe20 {
//Switch case
    public static void main(String[] args) {
        Scanner Masuk = new Scanner(System.in);
        int pil, porsi, harga = 0;    
        System.out.println("Menu Makanan");
        System.out.println("1. Es Teh \n2. Ayam Geprek \n3. nyo'nyang");
        System.out.println("Pilih: ");
        pil = Masuk.nextInt();
        System.out.print("porsi :");
        porsi = Masuk.nextInt();
        switch(pil){ 
            case 1:
                System.out.println("Es Teh(5000/porsi");
                harga = 5000*porsi;
                break;
            case 2:
                System.out.println("Ayam Geprek(13000/porsi");
                harga = 13000*porsi;
                break;
            case 3:
                System.out.println("nyo'nyang(3000/porsi");
                harga = 3000*porsi;
            default:
                System.out.println("Salah pilih");
                break;
        }
        System.out.println("Total : Rp. "+harga);
    }
}

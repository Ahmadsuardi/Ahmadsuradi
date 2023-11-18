import java.util.Scanner;
public class HariKe41SearchingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        String [] a = {"Ayam goreng","Somay","Nasi kuning"};
        int Td = 0;
        String cari;
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+". "+a[i]);
        }
        System.out.println("-----------");
        System.out.print("cari : ");
        cari = input.nextLine();
        for (int i = 0; i < a.length; i++) {
            if (cari.equalsIgnoreCase(a[i])) {
                System.out.println("nomor : "+(i+1));
                Td++;
            }
        }
        if (Td == 0) {
            System.out.println("Menu tidak ditemukan : ");            
        }
    }    

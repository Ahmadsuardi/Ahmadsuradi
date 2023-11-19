import java.util.Scanner;
public class HariKe42equals {
    public static void main(String[] args) {
        //(equals) yang hanya mengikuti huruf- huruf yang sudah di cantumkan contoh kalau kita masukan nama nadeo tapi huruf depannya tidak sama dengan huruf yang sudah di cantumkan maka ia tidak akan membaca data
        Scanner input = new Scanner(System.in);  
        String [] a = {"Ernando","Nadeo","Kurnia Meiga"};
        int Td = 0;
        String cari;
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+". "+a[i]);
        }
        System.out.println("-----------");
        System.out.print("cari : ");
        cari = input.nextLine();
        for (int i = 0; i < a.length; i++) {
            if (cari.equals(a[i])) {
                System.out.println("nomor : "+(i+1));
                Td++;
            }
        }
        if (Td == 0) {
            System.out.println("Nama tidak ditemukan : ");            
        }
    }    
}

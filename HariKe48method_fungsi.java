import java.util.Scanner;
public class HariKe48methid_fungsi {
    public static void siswa(String nama, int umur){
        System.out.println(nama+ "Berumur"+ umur+"tahun");
    }
    public static void main(String[] args) {
        String nm;
        int umr;
        Scanner masuk = new Scanner (System.in);
        System.out.print("nama : ");
        nm = masuk.nextLine();
        System.out.print("umur : ");
        umr = masuk.nextInt();
        System.out.println("Output");
        siswa(nm, umr);
         
    }  
}

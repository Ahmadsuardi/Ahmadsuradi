import java.util.Scanner;
public class HariKe28beras {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  long harga, total=0;
  double diskon = 0;
  System.out.println("Harga Rp.500000 Per Karung");
  harga = 500000;
  System.out.print("masukkan Jumlah Karung  : ");
  int beras = input.nextInt();
  if(beras>=150 && beras<300){
    System.out.println(" dapat Diskon 3%");
    diskon =  0.03*(harga * beras);
    long diskonTa = (long)diskon;
    total = (harga * beras)-diskonTa;
    System.out.println("Harga yang harus dibayar : "+total); 
  }else if(beras>=300){
    System.out.println("dapat Diskon 7%");
    diskon = 0.07*(harga * beras);
    long diskonTa = (long)diskon;
    total = (harga * beras)-diskonTa;
    System.out.println("Harga yang harus dibayar : "+total);
  }else{
    System.out.println("Tidak dapat Diskon");
    total = harga * beras;
    System.out.println("Harga yang harus dibayar : "+total);    
  }
  }
}

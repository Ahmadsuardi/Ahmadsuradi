public class HariKe37Deretangka {
    public static void main(String[] args) {
       int [] angka = {1,2,3,4,5};
       int total = 0;
       int jumlahindex = angka.length;
        System.out.print("Deret angka : ");
        for (int i = 0; i < jumlahindex; i++) {
            System.out.print(angka[i]+" ");
            total += angka[i];
        }
        System.out.println("\n-------");
        System.out.println("Total: "+total);
        
    }
          

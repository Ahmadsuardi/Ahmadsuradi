import java.lang.StringBuilder
public class hariKe97insert {
public static void main(String[] args) {
       StringBuilder kata = new StringBuilder("saya");
      printData(kata);
      
      // append

      kata.append(" beli baju");
      printData(kata);
      
      kata.append(" di Majene");
      printData(kata);
      
      //insert
      
      kata.insert(17,"kota ");
      printData(kata);
    
    }
    private static void printData(StringBuilder isidata){
        System.out.println("data = " + isidata);
        System.out.println("panjang = " + isidata.length());
        System.out.println("kapasitas = " + isidata.capacity());
        
        
        int addressBuilder = System.identityHashCode(isidata);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}

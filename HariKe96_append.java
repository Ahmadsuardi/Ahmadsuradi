import java.lang.StringBuilder;
public class hariKe96append {
public static void main(String[] args) {
       StringBuilder kalimat = new StringBuilder("halo");
      printData(kalimat);
      
      // append
      kalimat.append(" semuanya");
      printData(kalimat);
      
      kalimat.append(" warga Majene");
      printData(kalimat);
    
    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());
        
        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}

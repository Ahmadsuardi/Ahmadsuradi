public class HariKe79Stringsplit {
public static void main(String[] args) {   
       String ttl = "17 Juni 2005";
       String[] split = ttl.split(" ");
        
        String tgl = split[0];
        String bln = split[1];
        String thn = split[2];
   
        System.out.println("Tanggal\t: "+tgl);
        System.out.println("Bulan\t: "+bln);
        System.out.println("Tahun\t: "+thn);
         
         
        System.out.println("[ "+ttl+" ]");
        
    }
}

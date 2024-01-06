import java.util.Scanner;
import java.lang.String;
public class HariKe90StringKomponen {
public static void main(String[] args) {
        String kalimat = "saya suka makan pisang";
        
        //Mengammbil komponen dari string
        System.out.println(kalimat.charAt(5));
        
        //Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
    }
    
}

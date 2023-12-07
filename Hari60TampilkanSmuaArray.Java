import java.util.Arrays;
public class HariKe60menampilkansemuaArray {
public static void main(String[] args) {
       int[]nomor ={1, 2, 3, 4, 5};
        System.out.println("menggunakan perulangan for :");
        for (int i = 0; i < nomor.length; i++) {
        System.out.println(nomor[i]);        
        }          
        System.out.println("menggunakan Arrays : ");
        System.out.println(Arrays.toString(nomor));
    }    
}

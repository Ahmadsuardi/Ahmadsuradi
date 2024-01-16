import java.util.Arrays;
public class HariKe100equals {
public static void main(String[] args) {
     
        System.out.println("\nmembandingkan array\n_________");
         int[] arrayAngka = {1,2,3,4,5};
         int[] arrayAngka2 = {1,2,3,4,5};
         
        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka,arrayAngka2));
        
        if (Arrays.equals(arrayAngka,arrayAngka2)){
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }
  
    }
}

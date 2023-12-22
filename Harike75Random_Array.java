public class HariKe75RandomArray {
    public static void main(String[] args) {
     String buah[] = {"Mangga",
         "Nanas",
         "Apel",
         "Langsat",
         "Kelapa"};
     int a = 0;
     int b = buah.length-1;
     
     int angka = a+(int)(Math.random()*((b-a)+1));
        System.out.println(buah[angka]);       
     }    
}

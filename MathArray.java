public class HariKe69Mathmaks_array {
    public static void main(String[] args) {
        double x[] = {40, 2, 1, 5, 10, 12, 3};
        double maks = 0;
        for(int i = 0; i < x.length; i++){
            maks = Math.max(maks, x[i]);
        }
        System.out.println(""+maks);
   }
}

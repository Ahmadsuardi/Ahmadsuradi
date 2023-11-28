public class HariKe51Luas_dan_Keliling_Lingkaran {
    public static double LLingkaran(double phi, double r){
            double L = phi * r * r;
            return L;    
        }
        public static double KLingkran (double phi, double r){
            double d = 2 * r;
            double K = phi * d;
            return K;
        }
        public static void TLLingkaran(double phi, double r){
            System.out.println("L = phi x r x r");
            System.out.println("L = "+phi+" x "+r+" x "+r);
            System.out.println("L = "+LLingkaran(phi, r));
        }
        public static void TKLingkran(double  phi, double r){
            double d = 2 * r;
            System.out.println("K = phi x d");
            System.out.println("K = "+phi+" x "+d);
            System.out.println("K = "+KLingkran(phi, r));  
        }
        public static void main(String[] args) {
           final double phi = 3.14;
           double r;
           r = 7;
           System.out.println("Luas dan Keliling Lingkaran");
           TLLingkaran(phi, r);
           System.out.println("========");
           TKLingkran(phi, r);  
    }   
}

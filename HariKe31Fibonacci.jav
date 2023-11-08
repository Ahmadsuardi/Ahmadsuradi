public class HariKe31Deretfibonacci {
    public static void main(String[] args) {
 
      int f1  = 0; 
      int f2  = 1;
      int n   = 8;
      int R;
        System.out.println("Deret Fibonacci ");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("----");
        for(int a = 1; a < n; a++){
            R =  f2 + f1;
            System.out.println(R);
            f1 = f2;
            f2 = R;
        }
        System.out.println("=====");
    }
}

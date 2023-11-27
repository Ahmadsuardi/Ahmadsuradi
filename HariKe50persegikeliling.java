import java.util.Scanner;
public class HariKe50persegikeliling {
    public static int LuasPersegi(int s){
        int L = s * s;
        return(L);
    }
    public static int KelilingPersegi(int s){
        int K = 4 * s;
        return(K);
    }
    public static void TluasPersegi(int s){
        System.out.println("L = s x s");
        System.out.println("L = "+s+" x "+s);
        System.out.println("L = "+LuasPersegi(s));
    }
    public static void TKelilingPersegi(int s){
        System.out.println("K = 4 x s");
        System.out.println("K = 4  x "+s);
        System.out.println("K = "+KelilingPersegi(s));   
    }
    public static void main(String[] args) {
     int s;
        Scanner masuk = new Scanner (System.in);
        s = 10;
        System.out.println("L dan K Persegi");
        System.out.println("------------------");
        System.out.print("sisi persegi : ");
        s = masuk.nextInt();
        System.out.println("-----------------");
        TluasPersegi(s);
        System.out.println("");
        TKelilingPersegi(s);
    }   
}

public class HariKe52Bilpangkat {
    public static int pangkat(int a, int p){
        int hasil = a;
        for (int i = 1; i < p; i++) {
            hasil *= a;    
        }
        return hasil;
    }
    public static void Tpangkat(int a, int p){
        System.out.print(a+" pangkat "+p+" = ");
        System.out.print(pangkat(a, p));    
    }
    public static void main(String[] args) {
     int angka, pangkat;
     angka = 4;
     pangkat = 2;
     Tpangkat(angka,pangkat);
     System.out.println("");    
    }    
          }

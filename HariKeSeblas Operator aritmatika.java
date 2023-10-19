//Operator Aritmatika menggunakan Scanner
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai b = ");
        int b = input.nextInt();
        System.out.println ("a - b = "+(a-b));
        System.out.print("Maskkan nilai C = ");
        int C = input.nextInt();
        System.out.print("Masukkan nilai D = ");
        int D = input.nextInt();
        System.out.println("C * D = "+ C*D );
        System.out.print("Masukkan nilai E = ");
        int E = input.nextInt();
        System.out.print("Masukkan nilai F = ");
        int F = input.nextInt();
        System.out.println("E / F = "+ E / F );
        System.out.print("Masukkan nilai G =");
        int G = input.nextInt();
        System.out.print("Mesukkan nilai H = ");
        int H = input.nextInt();
        System.out.println("G + H =" + (G+H) );
        System.out.print("Maskkan nilai N = ");
        int N = input.nextInt();
        System.out.print("Masukkan nilai M = ");
        int M = input.nextInt();
        System.out.println("N % M = "+ N%M );
        
        
    }
}

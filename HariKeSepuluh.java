//Operator Aritmatika menggunakan Scanner
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai b = ");
        int b = input.nextInt();
        System.out.println ("a + b = "+(a+b));
        System.out.print("Maskkan nilai C = ");
        byte C = input.nextByte();
        System.out.print("Masukkan nilai D = ");
        byte D = input.nextByte();
        System.out.println("C * D = "+ (C*D));
        
        
        
    }

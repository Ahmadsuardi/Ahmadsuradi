import java.util.Scanner;
public class Harike35task {
 public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Bilangan Ganjil : ");
        System.out.println("-----------");
        int bil = masuk.nextInt();
        int angka = 1;
        int jumlah = 0;
        for (int i = 1; i <= bil; i+=2) {
            if(angka != 1){
                System.out.print("+");
          }
            System.out.print(angka);
            jumlah += angka;
            angka += 2;  
          }
            System.out.println("=" + jumlah);   
    }   
}

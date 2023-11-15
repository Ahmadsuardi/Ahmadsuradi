import java.util.Scanner;
public class HariKe38Array  {
public static void main(String[] args) {
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("JUMLAH : ");
        total = input.nextInt();
        int b[] = new int[total];
        System.out.println("Input : ");
        System.out.println("=============");
        for (int i = 0; i < total; i++) {
            System.out.print("index-"+i+" : ");
            b[i] = input.nextInt();
        }
        System.out.println("============");
        System.out.println("Output : ");
        for (int i = 0; i < total; i++) {
            System.out.println(b[i]+" ");
        }
        
    }

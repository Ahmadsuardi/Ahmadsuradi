import java.util.Scanner;
public class HariKe34 {
public static void main(String[] args) {
    int r[] = new int[3];
    Scanner masuk = new Scanner(System.in);
    System.out.("Input : ");
    System.out.println("----------");
    System.out.print("Index ke-0 : ");
    r[0] = masuk.nextInt();
    System.out.print("Index ke-1 : ");
    r[1] = masuk.nextInt();
    System.out.print("Index ke-2 : ");
    r[2] = masuk.nextInt();
            
    System.out.println("-------------");
    System.out.println("Output : ");
    System.out.println(r[0]+" "+r[1]+" "+r[2]);
    
}
    
}

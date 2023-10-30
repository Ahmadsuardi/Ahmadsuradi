import java.util.Scanner;
public class HariKe22switchcase {
 public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("input (P/L) : ");
        String pilih = masuk.nextLine();
        switch(pilih){
            case "P":
                System.out.println("Perempuan");
                break;
            case "L":
                System.out.println("Laki laki");
                break;
            default:
                System.out.println("pilhan salah");
                break;
            
            
                
                    
               
           }
    }
    
}

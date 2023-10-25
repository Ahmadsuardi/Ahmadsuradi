

import java.util.Scanner;

public class HariKe17  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan gaji");
        double gaji = input.nextDouble();
        System.out.println("gaji"+gaji);
        
        if(gaji >= 3000000 && gaji < 5000000){
            System.out.println("pajak 5%");
            System.out.println(gaji-(gaji*0.05));
        }else if (gaji >=500000){
            System.out.println("pajak 10%");
            System.out.println(gaji-(gaji*0.1));
        }else{
            System.out.println("tidak kena pajak5000");
        }
 
    }
    
}

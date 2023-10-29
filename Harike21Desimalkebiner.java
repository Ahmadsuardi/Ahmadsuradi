import java.util.Scanner;
public class desimalbiner { 
    
    public static void main(String[] args) {
        
       
        //Konversi desimal ke biner 
        Scanner input = new Scanner(System.in);
            int angka,i=0;
              int binary[] = new int [54];
                System.out.print(" angka desimal : ");
                  angka = input.nextInt();
         
        while(angka!=0){
            binary[i] = angka%2;
               angka = angka/2;
                 i++;}
        
        System.out.print("Angka binernya adalah : ");
              for (int j=i-1;j>=0;j--){
                  System.out.print(""+binary[j]);}
    }
}

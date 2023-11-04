import java.util.Scanner;
public class HariKe27Konversisuhu {
    
    //Konversi suhu
    //Celcius
    //Kelvin
    //Farhenheit
    //Reamur
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double C,F,K,R;
        System.out.println("suhu-suhu");
        System.out.println("1.Celcius ");
        System.out.println("2.Kelvin ");
        System.out.println("3.Farhenheit ");
        System.out.println("4.Reamur");
        System.out.print("Pilihan1 : ");
        int santos = masuk.nextInt();
        System.out.print("Pilihan2: ");
        int santos2 = masuk.nextInt();
        if(santos==1){
            System.out.println("Celcius : ");
            C = masuk.nextDouble();
            switch(santos2){
                case 2: K = C  + 273;
                    System.out.println("Kelvin :  "+K);
                    break;
                case 3 : F = 1.8*C + 23;
                    System.out.println("Farhenheit : "+F);
                    break;
                case 4: R = 0.8*C ;
                    System.out.println("Reamur : "+R);
                    break;
              }
        }else if(santos==2){
            System.out.print("Kelvin : ");
            K = masuk.nextDouble();
            switch(santos2){
                case 2: C = K - 273.15;
                    System.out.println("Celcius : "+C);
                    break;
                case 3: F = (K*9/5)-459.67;
                    System.out.println("Farhenheit : "+F);
                    break;
                case 4: R = 0.8*(K-273.15);
                    System.out.println("Reamur : "+R);
                    break;
            }
        }else if(santos==3){
            System.out.println("Farhenheit : ");
            F = masuk.nextDouble();
            switch(santos2){
                case 2: C = (F-32)*0.65;
                    System.out.println("Celcius :"+C);
                    break;
                case 3: K = (F+459.67)*.65;
                    System.out.println("Kelvin : "+K);
                    break;
                case 4: R = 0.44*(F-32);
                    System.out.println("Reamur : "+R);
                    break;
            }
        }else{
            System.out.println("Reamur : ");
            R = masuk.nextDouble();
            switch(santos2){
                case 1: C = R - 0.8;
                    System.out.println("Celcius : "+C);
                    break;
                case 2: K = (R/0.8)+273.15;
                System.out.println("Kelvin : "+K);
                break;
                case 3: F = (R*2.25)+32;
                    System.out.println("Farheheit : "+F);
                    break;
               }

            }
         }   
       }

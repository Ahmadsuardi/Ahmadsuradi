import java.util.Arrays;
public class Hari57Mpembelajarandikampus  {
public static void main(String[] args) {
    //Saya mengulang pembelajaran dikampus
       int[]nomor ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("menggunakan perulangan for :");
        for (int i = 0; i < nomor.length; i++) {
            System.out.println(nomor[i]);        
        }
        System.out.println("menggunakan perulangan for-each :"); 
        for(int nomor1 : nomor ){
            System.out.println(nomor1);
        }
        System.out.println("menggunakan perulangan while :");
        int j = 0;
        while (j < nomor.length){
            System.out.println(nomor [j]);
            j++;
        }
        System.out.println("menggunakan perulangan do : ");
        int k = 0;
        do{
            System.out.println(nomor[k]);
            k++;        
        }while (k < nomor.length);
        
        System.out.println("menggunakan Arrays : ");
        System.out.println(Arrays.toString(nomor));
    }    
}

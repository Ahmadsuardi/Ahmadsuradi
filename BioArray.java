public class BiodataArray {
public static void main(String[] args) {
       String biodata[][]={
        {"Nama  : ","AHMAD SUARDI"},
        {"Kelas : ","INFORMATIKA B"},
        {"NIM   : ","D0223011"},
        {"===== ","TERIMAKASIH ======"}
    };
        for (int i=0;i<biodata.length;i++){
            for (int j=0;j<biodata[i].length;j++){
               System.out.print(biodata[i][j]); 
            }
          System.out.println(""); 
        }
    }
}

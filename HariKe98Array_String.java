import java.util.Arrays;
public class hariKe98Array_String {
public static void main(String[] args) {
        
        int[] arrayAngka1 = {1,2,3,4,5};
        
        //mengubah array menjadi string
        System.out.println("\nMengubah array menjadi string\n_________________________");
        printArray(arrayAngka1);
        
        //mengkopi array
        System.out.println("\nMengkopi array\n_________________________");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("mengkopi dengan loop");
        for(int i=0; i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
    }
        printArray(arrayAngka1);
        printArray(arrayAngka2);
    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}

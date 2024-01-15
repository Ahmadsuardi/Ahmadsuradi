import java.util.Arrays;
public class HariKe99copyrange {
public static void main(String[] args) {
        
        int[] arrayAngka1 = {1,2,3,4,5,6,7,8,9};
  
        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3,9);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
       
    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}

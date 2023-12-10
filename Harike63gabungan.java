import java.util.Arrays;
public class hariKr63gabungan {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Menggunakan for : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Menggunakan for-each : ");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Menggunakan perulangan while :");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j]);
            j++;
        }
        System.out.println("Menggunakan Do-while :");
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);
        System.out.println("Menggunakan Arrays : ");
        System.out.println(Arrays.toString(numbers));
    }
}

import java.util.*;
public class array {
public static void main(String[] args) {
  int [] array = { 65, 80, 74, 89 } ;
  int Max = array[0];
  
  Arrays.sort(array);
  for (int i = 0; i < array.length - 1; i++){
    if( array[i] > Max ){
      Max = array[i];
    }
  }
   System.out.println(Max);
  }
}

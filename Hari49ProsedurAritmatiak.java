public class HariKe49ProsedurAritmatika {
    public static void operasi (int a, int b){
        int c;
        c = a + b;
        System.out.println(a+" + "+b+" = "+c);
        c = a * b;
        System.out.println(a+" * "+b+" = "+c);
        c = a - b;
        System.out.println(a+" - "+b+" = "+c);
        c = a / b;
        System.out.println(a+" : "+b+" = "+c);
    }
    public static void main(String[] args) {
      int a, b;
      a = 40;
      b = 20;
      operasi(a, b);
    }  
}

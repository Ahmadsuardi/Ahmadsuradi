public class hariKe73MathRandom  {
    public static void main(String[] args) {
       int x = 10;
       int y = 50;
       int angka = x + (int)(Math.random()*((y-x)+1));
       System.out.println(angka);
    }
}

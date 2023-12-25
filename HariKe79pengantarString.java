public class HariKe79PengantarString {
public static void main(String[] args) {
      String nama = "Ahmad Suardi";
      System.out.println("jml karakter\t: "+nama.length());
      System.out.println("uppercase\t: "+nama.toUpperCase());
      System.out.println("jml karakter\t: "+nama.toLowerCase());
     
      
        System.out.println("char[1]\t\t: "+nama.charAt(0));
        String[] kata = nama.split(" ");
        System.out.println("nama depan\t: "+kata[0]);
        System.out.println("nama belakang\t: "+kata[1]);
        System.out.println("jml kata\t: "+kata.length);
    } 
}

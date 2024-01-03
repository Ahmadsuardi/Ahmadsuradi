public class JmlArryForEacH {
    public static void main(String[] args) {
        int usia[] = {5, 15, 17, 20};
        int total = 0;
        
        for(int x : usia){
            total += x;
        }
        System.out.println(total);
    }
}

// Percabangan 

class Harike16percabangan {
    public static void main(String[] args) {
        double total = 200000;
        System.out.println("Belanja = Rp :"+ total);
        if(total >= 100000){
            System.out.println("Dapat diskon 20%");
            double diskon = 20 * total / 100;
            total -= diskon;
        } else {
            System.out.println("tidak dapat diskon");
        }
        System.out.println("Akhir = rp." + total);
        
    }
}     

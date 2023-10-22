class Harike14Logika {
    public static void main(String[] args) {
        // AND (&&)
        System.out.println("AND (&&)");
        // jika salah satu variabel bernilai false maka hasilnya  false
        boolean a,b,c;
        a = true;
        b = true;
        c = a&&b;
        System.out.(a+"  && "+b+"  = "+c);
        a = false;
        b = true;
        c = a&&b;
        System.out.println(a+" && "+b+"  = "+c);
        a = true;
        b = false;
        c = a&&b;
        System.out.println(a+"  && "+b+" = "+c);
        a = false;
        b = false;
        c = a&&b;
        System.out.println(a+" && "+b+" = "+c);
    
    }
}

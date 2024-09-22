public class ContohMethodStaticDanNonStatic {

    public static double hitungLuasPersegi(double sisi){
        return sisi * sisi;
    }

    public void tampilkanSelamatDatang(String nama){
        System.out.println("Selamat Datang, " + nama + "!");
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5: " + luasPersegi);

        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanSelamatDatang("John");
        objek.hitungLuasPersegi(5);

    }
}

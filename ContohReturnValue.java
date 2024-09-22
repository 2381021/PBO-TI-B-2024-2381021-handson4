public class ContohReturnValue {
    public static int tambah(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    public static void main(String[] args) {
        int hasilPenjumlahan = tambah(3, 5);
        System.out.println("3 + 5" + hasilPenjumlahan);

    }
}

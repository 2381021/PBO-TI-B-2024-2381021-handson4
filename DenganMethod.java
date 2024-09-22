public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakanan = 300000;
        int bonus = 1000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakanan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakanan, bonus, pajak, gajiBersih);
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjunganMakanan, int bonus){
        return gajiPokok + tunjanganTransport + tunjunganMakanan + bonus;
    }

    public static int hitungPajak(int totalPenghasilan){
        return totalPenghasilan * 10/100;
    }

    public static int hitungGajiBersih(int totalPenghasilan, int pajak){
        return totalPenghasilan - pajak;
    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjunganTransport, int tunjunganMakanan, int bonus, int pajak, int gajiBersih){
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjungan Transport: " + tunjunganTransport);
        System.out.println("Tunjungan Makanan: " + tunjunganMakanan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}

public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private int jumlahMalam;

    public Reservasi(Tamu tamu, Kamar kamar, int jumlahMalam) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahMalam = jumlahMalam;
    }

    public double hitungTotalBiaya() {
        return kamar.hitungBiaya(jumlahMalam);
    }

    public void tampilkanInfoReservasi() {
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("ID Tamu: " + tamu.getIdTamu());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Jumlah Malam: " + jumlahMalam);
        System.out.println("Total Biaya: " + hitungTotalBiaya());
    }
}
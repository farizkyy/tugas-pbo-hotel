public class KamarStandar extends Kamar {

    public KamarStandar(String nomorKamar, double hargaPerMalam) {
        super(nomorKamar, hargaPerMalam);
    }

    @Override
    public double hitungBiaya(int jumlahMalam) {
        return super.hitungBiaya(jumlahMalam) + hitungBiayaFasilitas(jumlahMalam);
    }
}
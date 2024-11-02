public class KamarSuite extends Kamar {
    private double biayaFasilitasSuite = 100000;

    public KamarSuite(String nomorKamar, double hargaPerMalam) {
        super(nomorKamar, hargaPerMalam);
    }

    @Override
    public double hitungBiaya(int jumlahMalam) {
        return super.hitungBiaya(jumlahMalam) + biayaFasilitasSuite + hitungBiayaFasilitas(jumlahMalam);
    }
}
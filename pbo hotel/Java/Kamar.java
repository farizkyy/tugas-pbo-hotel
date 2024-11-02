import java.util.ArrayList;
import java.util.List;

public class Kamar {
    protected String nomorKamar;
    protected double hargaPerMalam;
    protected List<Fasilitas> fasilitasTambahan;

    public Kamar(String nomorKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.fasilitasTambahan = new ArrayList<>();
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void tambahFasilitas(Fasilitas fasilitas) {
        fasilitasTambahan.add(fasilitas);
    }

    public double hitungBiayaFasilitas(int jumlahMalam) {
        double totalBiayaFasilitas = 0;
        for (Fasilitas fasilitas : fasilitasTambahan) {
            totalBiayaFasilitas += fasilitas.getBiaya() * jumlahMalam;
        }
        return totalBiayaFasilitas;
    }

    public double hitungBiaya(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }
}
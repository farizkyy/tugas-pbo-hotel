public class Fasilitas {
    private String namaFasilitas;
    private double biaya;

    public Fasilitas(String namaFasilitas, double biaya) {
        this.namaFasilitas = namaFasilitas;
        this.biaya = biaya;
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public double getBiaya() {
        return biaya;
    }
}
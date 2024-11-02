import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama tamu: ");
        String namaTamu = scanner.nextLine();
        System.out.print("Masukkan ID tamu: ");
        String idTamu = scanner.nextLine();
        Tamu tamu = new Tamu(namaTamu, idTamu);

        System.out.print("Pilih jenis kamar (1 untuk Standar, 2 untuk Suite): ");
        int jenisKamar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nomor kamar: ");
        String nomorKamar = scanner.nextLine();
        System.out.print("Masukkan harga per malam: ");
        double hargaPerMalam = scanner.nextDouble();

        Kamar kamar;
        if (jenisKamar == 1) {
            kamar = new KamarStandar(nomorKamar, hargaPerMalam);
        } else {
            kamar = new KamarSuite(nomorKamar, hargaPerMalam);
        }

        System.out.print("Tambahkan fasilitas tambahan? (y/n): ");
        char tambahFasilitas = scanner.next().charAt(0);
        scanner.nextLine();

        while (tambahFasilitas == 'y' || tambahFasilitas == 'Y') {
            System.out.print("Masukkan nama fasilitas: ");
            String namaFasilitas = scanner.nextLine();
            System.out.print("Masukkan biaya fasilitas: ");
            double biayaFasilitas = scanner.nextDouble();
            scanner.nextLine();

            Fasilitas fasilitas = new Fasilitas(namaFasilitas, biayaFasilitas);
            kamar.tambahFasilitas(fasilitas);

            System.out.print("Tambahkan fasilitas tambahan lain? (y/n): ");
            tambahFasilitas = scanner.next().charAt(0);
            scanner.nextLine();
        }

        System.out.print("Masukkan jumlah malam: ");
        int jumlahMalam = scanner.nextInt();

        Reservasi reservasi = new Reservasi(tamu, kamar, jumlahMalam);

        System.out.println("\n=== Informasi Reservasi ===");
        reservasi.tampilkanInfoReservasi();

        scanner.close();
    }
}
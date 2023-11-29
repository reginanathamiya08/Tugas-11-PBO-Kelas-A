import java.util.Scanner;

// Kelas utama (Driver Class)
public class MinimarketProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exception
        try {
            System.out.print("Masukkan No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();

            if (jumlahBarang <= 0) {
                throw new IllegalArgumentException("Jumlah barang harus lebih dari 0");
            }

            BarangRumahTangga barangElektronik = new BarangRumahTangga(namaBarang, hargaBarang, jumlahBarang);

            Faktur faktur = new Faktur(noFaktur, namaPelanggan, barangElektronik);

            System.out.print("Masukkan Total Bayar: ");
            double totalBayar = scanner.nextDouble();

            if (totalBayar < 0) {
                throw new IllegalArgumentException("Total bayar tidak boleh negatif");
            }

            faktur.setTotalBayar(totalBayar);

            faktur.display();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}

package pert2;

public class UjiBarang {
    public static void main(String[] args) {

        // 1. Barang Pertama: Gitar Akustik (Cara pertama: hanya kode dan nama)
        // Kode: "GTR-001", Nama: "Gitar Akustik Yamaha"
        BarangMusik gitarAkustik = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga menjadi Rp 1.500.000
        gitarAkustik.ubahHarga(1500000.0);

        // Tambahkan stok sebanyak 5 unit
        gitarAkustik.tambahStok(5);

        // 2. Barang Kedua: Drum Set (Cara ketiga: data lengkap)
        // Kode: "DRM-001", Nama: "Drum Set Pearl", Harga: 8.500.000, Stok: 3
        BarangMusik drumSet = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitarAkustik.tampilInfo();
        drumSet.tampilInfo();
    }
}

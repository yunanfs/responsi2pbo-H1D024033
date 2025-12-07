package pert2;

public class BarangMusik { // Deklarasikan variabel/state yang diperlukan di sini
private String kodeBarang;
private String namaAlatMusik;
private double hargaSatuan;
private int jumlahStok;

// --- Constructor (Method Overloading) ---

// Cara ketiga: Constructor Data Lengkap (Kode, Nama, Harga, Stok)
public BarangMusik(String kode, String nama, double harga, int stok) {
    this.kodeBarang = kode;
    this.namaAlatMusik = nama;
    this.hargaSatuan = harga;
    this.jumlahStok = stok;
}

// Cara kedua: Constructor Kode, Nama, dan Harga
// Stok otomatis diset 0.
public BarangMusik(String kode, String nama, double harga) {
    // Memanggil constructor lengkap, dengan stok diset 0
    this(kode, nama, harga, 0);
}

// Cara pertama: Constructor Hanya Kode dan Nama
// Harga otomatis diset 0.0 dan Stok otomatis diset 0.
public BarangMusik(String kode, String nama) {
    // Memanggil constructor harga (yang kemudian memanggil constructor lengkap)
    this(kode, nama, 0.0);
}

// --- Kemampuan Sistem ---

/**
 * Mengubah harga barang.
 * @param hargaBaru Harga satuan baru.
 */
public void ubahHarga(double hargaBaru) {
    if (hargaBaru >= 0) {
        this.hargaSatuan = hargaBaru;
        // System.out.println("Harga " + this.namaAlatMusik + " berhasil diubah menjadi Rp " + hargaBaru);
    } else {
        System.out.println("Harga tidak valid.");
    }
}

/**
 * Menambah stok barang.
 * @param jumlah Jumlah barang yang ditambahkan.
 */
public void tambahStok(int jumlah) {
    if (jumlah > 0) {
        this.jumlahStok += jumlah;
        // System.out.println("Stok " + this.namaAlatMusik + " bertambah " + jumlah + " unit. Total stok: " + this.jumlahStok);
    } else {
        System.out.println("Jumlah penambahan stok harus positif.");
    }
}

/**
 * Menampilkan informasi lengkap barang ke konsol.
 * Format: Alat musik [nama] | Kode: [kode] | Harga: Rp [harga] | Stok: [stok] unit
 */
public void tampilInfo() {
    System.out.println(
            "Alat musik " + this.namaAlatMusik +
                    " | Kode: " + this.kodeBarang +
                    " | Harga: Rp " + this.hargaSatuan +
                    " | Stok: " + this.jumlahStok + " unit"
    );
}
}

package pert3;

public class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // 1. Buat objek Karyawan biasa (Budi)
        // Nama: "Budi Santoso", Gaji Pokok: Rp 4.000.000
        Karyawan budi = new Karyawan("Budi Santoso", 4000000.0);

        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        budi.tampilInfo();

        System.out.println(); // Baris baru/jarak

        // 2. Buat objek Manajer (Siti)
        // Nama: "Siti Aminah", Gaji Pokok: Rp 6.000.000, Tunjangan: Rp 2.500.000
        Manajer siti = new Manajer("Siti Aminah", 6000000.0, 2500000.0);

        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        siti.tampilInfo();
    }
}
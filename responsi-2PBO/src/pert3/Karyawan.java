package pert3;

public class Karyawan {
    // Gunakan 'protected' agar variabel ini dapat diakses langsung oleh subclass
    protected String nama;
    protected double gajiPokok;

    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan informasi dasar karyawan
    public void tampilInfo() {
        System.out.println(
                "Nama: " + this.nama +
                        " | Gaji Pokok: Rp " + this.gajiPokok
        );
    }
}

/**
 * Subclass (Child Class) yang mewarisi Karyawan
 */
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer
    private double tunjangan;

    // Constructor untuk inisialisasi Manajer
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        // Panggil constructor dari parent class (Karyawan)
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    // Menambahkan informasi tunjangan dan total gaji
    @Override
    public void tampilInfo() {
        // Opsi 1: Panggil method tampilInfo() dari parent class untuk mencetak nama dan gaji pokok
        // super.tampilInfo();

        // Opsi 2: Langsung mengakses variabel protected dan mencetak semua data
        double totalGaji = this.gajiPokok + this.tunjangan;

        System.out.println(
                "Nama: " + this.nama +
                        " | Gaji Pokok: Rp " + this.gajiPokok +
                        " | Tunjangan: Rp " + this.tunjangan
        );
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}

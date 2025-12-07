package pert6;

public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        // Panggil constructor parent
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        // Tidak boleh dinyalakan jika energi di bawah 20%
        if (this.levelEnergi < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        // Konsumsi energi: 3% per 1 km.
        double konsumsi = jarak * 3.0;

        if (this.levelEnergi < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            this.levelEnergi -= (int) konsumsi;
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = this.levelEnergi;
        this.levelEnergi = Math.min(100, this.levelEnergi + jumlah);
        System.out.println("Mengisi energi Pesawat Tempur. Energi naik dari " + energiAwal + "% menjadi " + this.levelEnergi + "%.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    public void tembakRudal(int jumlah) {
        // Hanya dapat menembakkan rudal jika jumlahnya mencukupi
        if (this.jumlahRudal >= jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak. Jumlah rudal (" + this.jumlahRudal + ") tidak mencukupi.");
        }
    }
}

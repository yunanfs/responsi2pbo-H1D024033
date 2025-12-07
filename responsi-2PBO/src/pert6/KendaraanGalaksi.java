package pert6;

public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private, diakses via getter/protected)
    // ==========================================================

    private String namaKendaraan;
    protected int levelEnergi; // Menggunakan protected agar subclass mudah mengakses
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // levelEnergi default = 100
    }


    // ==========================================================
    // GETTER
    // ==========================================================

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    /**
     * Method final tampilStatus()
     * Format: "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] orang"
     */
    public final void tampilStatus() {
        System.out.println(
                this.namaKendaraan +
                        " | Energi: " + this.levelEnergi + "%" +
                        " | Kapasitas: " + this.kapasitasPenumpang + " orang"
        );
    }


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}

package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    private int modulScan; // kemampuan scan planet (level 1–5)


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        // Tidak dapat memulai misi jika energi di bawah 15%
        if (this.levelEnergi < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        // Konsumsi energi: 2% per 1 km.
        double konsumsi = jarak * 2.0;

        if (this.levelEnergi < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            this.levelEnergi -= (int) konsumsi;
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = this.levelEnergi;
        this.levelEnergi = Math.min(100, this.levelEnergi + jumlah);
        System.out.println("Mengisi energi Kapal Eksplorasi. Energi naik dari " + energiAwal + "% menjadi " + this.levelEnergi + "%.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    public void scanPlanet(String namaPlanet) {
        // Dapat melakukan scan planet untuk mengumpulkan data ilmiah
        System.out.println(
                "Melakukan scan pada planet " + namaPlanet +
                        " dengan modul level " + this.modulScan + "."
        );
    }
}

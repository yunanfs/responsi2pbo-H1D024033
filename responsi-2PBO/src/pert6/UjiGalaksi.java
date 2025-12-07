package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");

        // ==========================================================
        // PENGUJIAN PESAWAT TEMPUR
        // ==========================================================

        System.out.println("\n--- PESAWAT TEMPUR ---");

        // Buat objek PesawatTempur: "Astra-Fury", Kapasitas: 2, Rudal: 8
        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);

        // Aktifkan mesin
        astraFury.aktifkanMesin();

        // Pesawat menjelajah sejauh 10 km (Konsumsi 10 * 3% = 30%)
        astraFury.jelajah(10); // Energi tersisa: 100 - 30 = 70%

        // Pesawat mencoba menjelajah 30 km lagi (Konsumsi 30 * 3% = 90%. Tidak cukup!)
        astraFury.jelajah(30);

        // Pesawat menembakkan 3 rudal
        astraFury.tembakRudal(3);

        // Tampilkan status kendaraan
        astraFury.tampilStatus();


        // ==========================================================
        // PENGUJIAN KAPAL EKSPLORASI
        // ==========================================================

        System.out.println("\n--- KAPAL EKSPLORASI ---");

        // Buat objek KapalEksplorasi: "Voyager X", Kapasitas: 10, Modul scan: 4
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);

        // Aktifkan mesin
        voyagerX.aktifkanMesin();

        // Kapal menjelajah sejauh 15 km (Konsumsi 15 * 2% = 30%)
        voyagerX.jelajah(15); // Energi tersisa: 100 - 30 = 70%

        // Kapal melakukan scan pada planet "Kepler-442b"
        voyagerX.scanPlanet("Kepler-442b");

        // Tampilkan status kapal
        voyagerX.tampilStatus();
    }
}
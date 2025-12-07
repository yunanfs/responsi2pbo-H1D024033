package pert1;

public class Pengguna {
    // === STATE / VARIABEL ===
    int umur;
    double berat;
    double tinggi;

    // Konstanta (Final Variable)
    // Nilai ini tidak bisa diubah setelah program berjalan
    final double faktorAktivitas = 1.2;

    // === BEHAVIOR / METHOD ===

    // 1. Menghitung BMI
    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    // 2. Menampilkan Kategori BMI
    void tampilKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    // 3. Menghitung Kebutuhan Kalori
    double hitungKalori() {
        return berat * faktorAktivitas * 10;
    }

    // 4. Menampilkan Semua Informasi
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");

        // %.2f artinya format desimal dengan 2 angka di belakang koma
        System.out.printf("BMI: %.2f\n", hitungBMI());

        tampilKategori();

        // (int) digunakan untuk menghilangkan koma pada tampilan kalori
        System.out.println("Kebutuhan Kalori: " + (int)hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}

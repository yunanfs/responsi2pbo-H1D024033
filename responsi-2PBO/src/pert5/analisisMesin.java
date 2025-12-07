package pert5;

public class analisisMesin {
    public static void main(String[] args) {

        // 1. Buat array defaultMesin (menggunakan tipe data parent)
        defaultMesin[] inventarisMesin = new defaultMesin[5];

        // Isi array dengan objek-objek uji coba
        inventarisMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventarisMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventarisMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventarisMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventarisMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        // --- Bagian 1: Tampilkan Info, Kategori, dan Performa ---
        System.out.println("=== DATA MESIN MEGATECH ===");

        for (int i = 0; i < inventarisMesin.length; i++) {
            defaultMesin mesin = inventarisMesin[i];
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            // Manual formatting karena printf kadang membingungkan pemula, tapi printf aman tanpa import
            System.out.printf("Performa: %.1f\n\n", mesin.nilaiPerforma());
        }

        // --- Bagian 2: Suara Mesin (Polimorfisme + Downcasting) ---
        System.out.println("=== SUARA MESIN ===");
        for (int i = 0; i < inventarisMesin.length; i++) {
            defaultMesin mesin = inventarisMesin[i];

            if (mesin instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) mesin;
                System.out.println(motor.namaMesin + " -> " + motor.suaraMesin());
            } else if (mesin instanceof mesinTraktorListrik) {
                mesinTraktorListrik traktorListrik = (mesinTraktorListrik) mesin;
                System.out.println(traktorListrik.namaMesin + " -> " + traktorListrik.suaraMesin());
            } else if (mesin instanceof mesinTraktor) {
                mesinTraktor traktor = (mesinTraktor) mesin;
                System.out.println(traktor.namaMesin + " -> " + traktor.suaraMesin());
            }
        }

        // --- Bagian 3: Mesin Performa Tertinggi ---
        defaultMesin mesinTertinggi = null;
        double performaTertinggi = -1.0;

        for (int i = 0; i < inventarisMesin.length; i++) {
            double performaSaatIni = inventarisMesin[i].nilaiPerforma();
            if (performaSaatIni > performaTertinggi) {
                performaTertinggi = performaSaatIni;
                mesinTertinggi = inventarisMesin[i];
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        if (mesinTertinggi != null) {
            System.out.printf("%s -> %.1f\n", mesinTertinggi.namaMesin, performaTertinggi);
        }

        // --- Bagian 4: TOP 3 Mesin Terbaik (Manual Sorting) ---
        // Karena tidak boleh pakai Arrays.sort, kita buat logic sorting sendiri (Bubble Sort)
        // Kita urutkan dari BESAR ke KECIL (Descending)

        for (int i = 0; i < inventarisMesin.length - 1; i++) {
            for (int j = 0; j < inventarisMesin.length - 1 - i; j++) {
                // Jika mesin sekarang LEBIH KECIL dari mesin sebelahnya, tukar posisi
                // agar yang besar naik ke depan (index awal)
                if (inventarisMesin[j].nilaiPerforma() < inventarisMesin[j + 1].nilaiPerforma()) {
                    // Proses tukar (swap)
                    defaultMesin temp = inventarisMesin[j];
                    inventarisMesin[j] = inventarisMesin[j + 1];
                    inventarisMesin[j + 1] = temp;
                }
            }
        }

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Tampilkan 3 data teratas (atau kurang jika data < 3)
        int limit = 3;
        if (inventarisMesin.length < 3) {
            limit = inventarisMesin.length;
        }

        for (int i = 0; i < limit; i++) {
            defaultMesin mesin = inventarisMesin[i];
            System.out.printf("%d. %s -> %.1f\n", (i + 1), mesin.namaMesin, mesin.nilaiPerforma());
        }
    }
}

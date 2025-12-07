package pert8;

public class UjiSDM {
    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        // 1. BUAT OBJEK ProgrammerMagang
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");


        // 2. PENGUJIAN METODE BERURUTAN

        // Panggil method hitungGaji(160).
        andi.hitungGaji(160); // Output: Gaji Andi (160 jam) adalah: Rp 8000000.0

        // Cetak hasil dari method getStatusCuti(). (Overriden Default Method)
        System.out.println("Status Cuti: " + andi.getStatusCuti()); // Output: Status Cuti: Tersedia 5 hari

        // Panggil login("9999") (Tes PIN salah).
        andi.login("9999"); // Output: Login Gagal: PIN salah.

        // Panggil login("1234") (Tes PIN benar).
        andi.login("1234"); // Output: Login Berhasil. Selamat datang, Andi!

        // Cetak hasil dari method getRoleAkses(). (Overriden Default Method)
        System.out.println("Role Akses: " + andi.getRoleAkses()); // Output: Role Akses: Magang IT

        // Panggil perpanjangKontrak(6).
        andi.perpanjangKontrak(6); // Output: Kontrak diperpanjang 6 bulan.

        // Panggil logout().
        andi.logout(); // Output: Andi berhasil logout.
    }
}

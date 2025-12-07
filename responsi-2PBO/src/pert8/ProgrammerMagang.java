package pert8;

// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin; // default: false


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; // Inisialisasi atribut sedangLogin dengan nilai default 'false'.
    }


    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================

    @Override
    public double hitungGaji(int jamKerja) {
        // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
        double totalGaji = jamKerja * this.gajiPerJam;
        System.out.printf("Gaji %s (%d jam) adalah: Rp %.1f\n", this.nama, jamKerja, totalGaji);
        return totalGaji;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        // LOGIKA: Tampilkan pesan konfirmasi perpanjangan kontrak.
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Tersedia 5 hari".
        return "Tersedia 5 hari";
    }


    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================

    @Override
    public void login(String pin) {
        // LOGIKA: Cek apakah pin yang diterima sama dengan pinRahasia.
        if (pin.equals(this.pinRahasia)) {
            // Jika sama, ubah sedangLogin = true dan tampilkan pesan berhasil.
            this.sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + this.nama + "!");
        } else {
            // Jika tidak, tampilkan pesan gagal.
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        // LOGIKA: Ubah sedangLogin = false dan tampilkan pesan logout.
        this.sedangLogin = false;
        System.out.println(this.nama + " berhasil logout.");
    }

    @Override
    public String getRoleAkses() {
        // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Magang IT".
        return "Magang IT";
    }
}

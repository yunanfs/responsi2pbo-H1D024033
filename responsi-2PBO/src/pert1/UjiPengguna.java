package pert1;

public class UjiPengguna {
    public static void main(String[] args) {
        // 1. Instansiasi Objek
        // Membuat objek 'p' dari class Pengguna
        Pengguna p = new Pengguna();

        // 2. Mengisi Data (Sesuai soal)
        p.umur = 25;
        p.berat = 60;
        p.tinggi = 170;

        // 3. Memanggil Method Utama
        p.tampilInfo();

        // 4. Demonstrasi Konstanta Final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");

        System.out.println("\nJika kita mencoba menulis:");
        System.out.println("p.faktorAktivitas = 1.5;");

        System.out.println("\nMaka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");

        // Jika baris di bawah ini di-uncomment, program akan error saat dicompile
        // p.faktorAktivitas = 1.5;
    }
}

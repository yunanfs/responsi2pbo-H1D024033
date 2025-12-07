package pert5;

public class defaultMesin {
    // Variabel umum mesin (protected agar bisa diakses subclass)
    protected String namaMesin;
    protected int tenagaHP;

    // Constructor
    public defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    public void tampilInfo() {
        System.out.printf("Mesin %s | Tenaga: %d HP\n", this.namaMesin, this.tenagaHP);
    }

    public double nilaiPerforma() {
        // Perhitungan standar (default)
        return this.tenagaHP * 1.0;
    }

    public String kategoriMesin() {
        // Kategori default
        return "Mesin Umum";
    }
}

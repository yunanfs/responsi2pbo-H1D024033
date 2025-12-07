package pert4;

public class Customer {
    // Gunakan 'protected' agar variabel dapat diakses langsung oleh subclass
    protected String namaLengkap;
    protected String nomorIdentitasCustomer;
    protected int totalBelanja;

    // Constructor untuk inisialisasi Customer
    public Customer(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.nomorIdentitasCustomer = nomorIdentitasCustomer;
        this.totalBelanja = totalBelanja;
    }

    /**
     * Menampilkan informasi dasar pelanggan.
     */
    public void tampilkanInfo() {
        System.out.println(
                "Nama: " + this.namaLengkap +
                        " | ID: " + this.nomorIdentitasCustomer +
                        " | Total Belanja: Rp " + this.totalBelanja
        );
    }
}

/**
 * Subclass (Child Class) untuk pelanggan Member.
 * Mewarisi semua properti dan method dari Customer.
 */
class Member extends Customer {
    // Atribut tambahan khusus Member
    private int poinReward;
    private String levelKeanggotaan;

    // Constructor untuk Member
    public Member(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        // Memanggil constructor dari parent class (Customer) menggunakan 'super'
        super(namaLengkap, nomorIdentitasCustomer, totalBelanja);

        // Inisialisasi atribut khusus Member
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    /**
     * Meng-override method tampilkanInfo() untuk menampilkan informasi detail Member.
     */
    @Override
    public void tampilkanInfo() {
        // 1. Panggil method tampilkanInfo() dari parent class (Customer)
        super.tampilkanInfo();

        // 2. Tampilkan data tambahan khusus Member
        System.out.println(
                "Poin Reward: " + this.poinReward +
                        " | Level: " + this.levelKeanggotaan
        );
    }
}

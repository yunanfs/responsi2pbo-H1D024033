package pert7;

/**
 * Class ini mengimplementasikan interface PaymentMethod untuk E-Wallet.
 */
public class EWalletPayment implements PaymentMethod {

    // ==========================================================
    // ATRIBUT/STATE
    // ==========================================================
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoAwal;
    private double saldoPengguna;

    // Konstanta biaya transaksi (misal Rp 2.000)
    private static final double FEE = 2000.0;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    /**
     * Constructor untuk membuat objek EWalletPayment.
     * @param namaLayanan Nama layanan e-wallet (cth: OVO, Dana).
     * @param nominalPembayaran Jumlah yang harus dibayar.
     * @param saldoPengguna Saldo awal pengguna.
     */
    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoAwal = saldoPengguna; // Menyimpan saldo awal untuk ditampilkan
        this.saldoPengguna = saldoPengguna;
    }

    // ==========================================================
    // IMPLEMENTASI METHOD DARI INTERFACE
    // ==========================================================

    @Override
    public String processPayment() {
        // Total biaya: nominal pembayaran + biaya transaksi
        double totalBiaya = this.nominalPembayaran + getTransactionFee();

        // Pengecekan saldo
        if (this.saldoPengguna >= totalBiaya) {
            // Saldo cukup: kurangi saldo
            this.saldoPengguna -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            // Saldo tidak cukup
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + this.namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return FEE;
    }

    @Override
    public double getBalance() {
        return this.saldoPengguna;
    }

    // ==========================================================
    // GETTER UNTUK KEPENTINGAN DISPLAY
    // ==========================================================

    public double getSaldoAwal() {
        return this.saldoAwal;
    }

    public double getNominalPembayaran() {
        return this.nominalPembayaran;
    }
}
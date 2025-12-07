package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        // Data Uji Coba
        double saldoAwal = 150000.0;
        double nominalBayar = 50000.0;
        String layanan = "OVO";

        // Buat objek dari EWalletPayment
        EWalletPayment eWallet = new EWalletPayment(layanan, nominalBayar, saldoAwal);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // 1. Menampilkan data sebelum transaksi
        System.out.printf("Saldo awal: %.0f\n", eWallet.getSaldoAwal());
        System.out.printf("Memproses pembayaran sebesar %.0f...\n", eWallet.getNominalPembayaran());
        System.out.printf("(Biaya Transaksi: %.0f)\n", eWallet.getTransactionFee());

        // 2. Memproses pembayaran
        String hasilTransaksi = eWallet.processPayment();

        System.out.println();

        // Menampilkan hasil dari processPayment()
        System.out.println(hasilTransaksi);

        // 3. Menampilkan data setelah transaksi
        // Saldo yang tersisa setelah dikurangi nominal (50000) dan fee (2000)
        // 150000 - 52000 = 98000
        System.out.printf("Sisa Saldo: %.0f\n", eWallet.getBalance());

        // Menampilkan detail transaksi
        System.out.println(eWallet.getPaymentDetails());
        System.out.println("=========================================");
    }
}

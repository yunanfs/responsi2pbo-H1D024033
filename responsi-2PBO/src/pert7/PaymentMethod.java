package pert7;

/**
 * Interface ini mendefinisikan kontrak minimal untuk setiap metode pembayaran.
 */
public interface PaymentMethod {

    // Method untuk memproses transaksi pembayaran
    String processPayment();

    // Method untuk mengembalikan informasi detail transaksi
    String getPaymentDetails();

    // Method untuk mengembalikan biaya transaksi
    double getTransactionFee();

    // Method untuk mengembalikan saldo saat ini
    double getBalance();
}

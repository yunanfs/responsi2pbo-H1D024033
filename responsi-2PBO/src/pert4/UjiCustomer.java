package pert4;

public class UjiCustomer {
    public static void main(String[] args) {

        // 1. Buat object Customer (Budi)
        Customer customerBudi = new Customer("Budi Santoso", "CST-001", 500000);

        // 2. Buat object Member (Siti)
        Member memberSiti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // --- Customer Biasa ---
        System.out.println("Status: Customer Biasa");
        customerBudi.tampilkanInfo();
        System.out.println(); // Jarak baris

        // --- Pelanggan Member ---
        System.out.println("Status: Member");
        memberSiti.tampilkanInfo();
    }
}

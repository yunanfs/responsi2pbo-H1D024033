package pert4;

public class UjiCustomer {
    public static void main(String[] args) {

        // 1. Buat object Customer (Yunan)
        Customer customerYunan = new Customer("Yunan Unsoed", "CST-001", 500000);

        // 2. Buat object Member (Faila)
        Member memberFaila = new Member("Faila Unsoed", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // --- Customer Biasa ---
        System.out.println("Status: Customer Biasa");
        customerYunan.tampilkanInfo();
        System.out.println(); 

        // --- Pelanggan Member ---
        System.out.println("Status: Member");
        memberFaila.tampilkanInfo();
    }
}

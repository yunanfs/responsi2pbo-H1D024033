package pert5;

public class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik
    protected double kapasitasBaterai;

    // Constructor
    public mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik); // Panggil constructor parent (mesinTraktor)
        this.kapasitasBaterai = baterai;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor Listrik %s | Tarik: %.1f ton | Baterai: %.0f kWh | Tenaga: %d HP\n",
                this.namaMesin, this.kapasitasTarik, this.kapasitasBaterai, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        // Rumus performa traktor listrik
        // performa = tenagaHP x 0.9 + kapasitasTarik x 10 + kapasitasBaterai x 5
        return (this.tenagaHP * 0.9) + (this.kapasitasTarik * 10.0) + (this.kapasitasBaterai * 5.0);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override // Override suaraMesin dari mesinTraktor
    public String suaraMesin() {
        return "Bzzzzz! Mesin traktor listrik aktif!";
    }
}

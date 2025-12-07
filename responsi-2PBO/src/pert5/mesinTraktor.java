package pert5;

public class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor
    protected double kapasitasTarik;

    // Constructor
    public mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor %s | Tarik: %.1f ton | Tenaga: %d HP\n",
                this.namaMesin, this.kapasitasTarik, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        // Rumus performa traktor: (tenagaHP * 1.05) + (kapasitasTarik * 5)
        return (this.tenagaHP * 1.05) + (this.kapasitasTarik * 5.0);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    // Method unik
    public String suaraMesin() {
        return "GGGRRRR! Hidup mesinnn!";
    }
}

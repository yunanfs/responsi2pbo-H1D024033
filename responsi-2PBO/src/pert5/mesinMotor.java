package pert5;

public class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor
    protected String tipeMotor;

    // Constructor
    public mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Motor %s | Tipe: %s | Tenaga: %d HP\n",
                this.namaMesin, this.tipeMotor, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        // performa = tenagaHP x 1.2
        return this.tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    // Method unik
    public String suaraMesin() {
        return "Brummm! Mesin motor menyala!";
    }
}

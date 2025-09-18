public class TugasMembaca extends Tugas implements Prioritas {
    private String bab;
    private String prioritas;

    public TugasMembaca(String judul, String deadline, String bab) {
        super(judul, deadline);
        this.bab = bab;
        this.prioritas = "Normal";
    }

    @Override
    public void setPrioritas(String level) {
        this.prioritas = level;
    }

    @Override
    public String getPrioritas() {
        return prioritas;
    }

    @Override
    public String toString() {
        return String.format("%s (deadline: %s) [%s] - Bab: %s - Prioritas: %s",
                judul, deadline, status, bab, prioritas);
    }
}


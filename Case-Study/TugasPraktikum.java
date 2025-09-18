public class TugasPraktikum extends Tugas implements Prioritas {
    private String mataKuliah;
    private String prioritas;

    public TugasPraktikum(String judul, String deadline, String mataKuliah) {
        super(judul, deadline);
        this.mataKuliah = mataKuliah;
        this.prioritas = "Normal"; // default
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
        return String.format("%s (deadline: %s) [%s] - Mata Kuliah: %s - Prioritas: %s",
                judul, deadline, status, mataKuliah, prioritas);
    }
}

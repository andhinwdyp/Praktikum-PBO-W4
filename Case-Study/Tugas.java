public abstract class Tugas {
    protected String judul;
    protected String deadline;
    protected String status;

    public Tugas(String judul, String deadline) {
        this.judul = judul;
        this.deadline = deadline;
        this.status = "Belum Selesai";
    }

    public String getJudul() { return judul; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }

    public void selesai() {
        this.status = "Selesai";
    }

    public abstract String toString();
}

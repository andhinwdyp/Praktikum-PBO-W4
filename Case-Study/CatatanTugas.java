import java.util.ArrayList;

public class CatatanTugas {
    private Mahasiswa mahasiswa;
    private ArrayList<Tugas> daftarTugas;

    public CatatanTugas(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarTugas = new ArrayList<>();
    }

    public void tambahTugas(Tugas t) {
        daftarTugas.add(t);
    }

    public void tandaiSelesai(int index) {
        if (index >= 0 && index < daftarTugas.size()) {
            daftarTugas.get(index).selesai();
        }
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Tugas " + mahasiswa.getNama() + " ===");
        for (int i = 0; i < daftarTugas.size(); i++) {
            System.out.println((i+1) + ". " + daftarTugas.get(i));
        }
    }
}

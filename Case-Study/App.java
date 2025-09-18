public class App {
    public static void main(String[] args) {
        Mahasiswa andhini = new Mahasiswa("241511068", "Andhini Widya Putri Wastika");
        CatatanTugas catatan = new CatatanTugas(andhini);

        // Tambah tugas dengan subclass
        catatan.tambahTugas(new TugasPraktikum("Praktikum 2 Kelas 2C", "2025-09-01", "Pemrograman Berorientasi Objek"));
        catatan.tambahTugas(new TugasMembaca("Baca Materi", "2025-09-02", "Object, Class & Encapsulation"));

        // Tampilkan daftar tugas
        catatan.tampilkanSemua();

        // Tandai tugas pertama selesai
        System.out.println("\nMenandai tugas 1 sebagai selesai...\n");
        catatan.tandaiSelesai(0);

        // Tampilkan lagi daftar tugas
        catatan.tampilkanSemua();
    }
}

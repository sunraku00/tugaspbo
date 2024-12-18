import java.util.ArrayList;

public class DaftarMataKuliah {
    private ArrayList<MataKuliah> daftar;

    public DaftarMataKuliah() {
        daftar = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftar.add(mataKuliah);
    }

    public void tampilkanDaftar() {
        for (MataKuliah mk : daftar) {
            System.out.println(mk);
        }
    }

    public int hitungJumlahMataKuliah() {
        return daftar.size();
    }

    public MataKuliah cariMataKuliah(String nama) {
        return daftar.stream()
                .filter(mk -> mk.getNama().equalsIgnoreCase(nama))
                .findFirst()
                .orElse(null);
    }
}

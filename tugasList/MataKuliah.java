public class MataKuliah {
    private String nama;
    private String kode;
    private int sks;

    public MataKuliah(String nama, String kode, int sks) {
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" +
                "nama='" + nama + '\'' +
                ", kode='" + kode + '\'' +
                ", sks=" + sks +
                '}';
    }
}

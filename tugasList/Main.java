import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarMataKuliah daftarMataKuliah = new DaftarMataKuliah();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks = scanner.nextInt();
                    daftarMataKuliah.tambahMataKuliah(new MataKuliah(nama, kode, sks));
                    break;
                case 2:
                    daftarMataKuliah.tampilkanDaftar();
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaCari = scanner.nextLine();
                    MataKuliah hasilCari = daftarMataKuliah.cariMataKuliah(namaCari);
                    if (hasilCari != null) {
                        System.out.println("Mata Kuliah Ditemukan: " + hasilCari);
                    } else {
                        System.out.println("Mata Kuliah tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih semangat belajarnyaa!!!!!.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

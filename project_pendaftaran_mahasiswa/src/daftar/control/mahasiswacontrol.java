package daftar.control;

import java.util.List;
import java.util.Scanner;
import daftar.model.mahasiswa;
import daftar.Utility;

public class mahasiswacontrol  {
    private List<mahasiswa> listmahasiswa;
    static  Scanner scan = new Scanner(System.in);

    public mahasiswacontrol(List<mahasiswa> listmahasiswa){
        this.listmahasiswa = listmahasiswa;
        menumahasiswa();
    }
    void  menumahasiswa(){
        int pilih = 0;
        do {
            show();

            System.out.println("[1] Input Data Mahasiswa");
            System.out.println("[2] Update Data");
            System.out.println("[3] Hapus Data");
            System.out.println("[0] Halaman Utama");
            System.out.println("Pilih Menu \n ============");
            pilih = Utility.inputInt(scan.nextLine());

            switch (pilih) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    input();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    hapus();
                    break;
                default:
                    break;
          }
        } while (pilih != 0);
    }

    void show() {
        System.out.println(
                "_____________________________________________________________________________________");
        System.out.println(
                "| NO | Nama Mahasiswa |   alamat   |   asalSekolah    |   TahunLulus   |   Jurusan  |");
        System.out.println(
                "=====================================================================================");
                int i = 1;
                for (mahasiswa Nama :listmahasiswa){
                    System.out.printf("|%-4s|%-16s|%-12s|%-18s|%-16s|%-12s|\n",i++,Nama.getNama(),
                    Nama.getAlamat(),
                    Nama.getAsalSekolah(),
                    Nama.getTahunLulus(),
                    Nama.getjurusan());
                }
    }
    void input() {
        mahasiswa b = new mahasiswa();
        System.out.println("Masukkan Nama Mahasisawa");
        b.setNama (scan.nextLine());
        System.out.println("Masukkan alamat");
        b.setAlamat (scan.nextLine());
        System.out.println("Masukkan asal Sekolah");
        b.setAsalSekolah(scan.nextLine());
        System.out.println("Masukkan Tahun lulus");
        b.setTahunLulus(Utility.inputInt(scan.nextLine()));
        System.out.println("Masukkan jurusan");
        b.setJurusan(scan.nextLine());
        listmahasiswa.add(b);
    }

    void update() {
        System.out.println("======Ubah Data Mahasiswa======");
        System.out.println("~Kosongkan Data Jika Tidak Ingin Dirubah~");
        System.out.println("~Ketik 0 kembali ke menu utama-");
        System.out.println("Pilih NO :");
        int inputan = Utility.inputInt(scan.nextLine());
        if (inputan > 0 && --inputan < listmahasiswa.size()) {
            System.out.println("Masukkan nama");
            String nama = scan.nextLine();
            if (!nama.equals("")) {
                listmahasiswa.get(inputan).setNama(nama);
            }
            System.out.println("Masukkan alamat");
            String alamat= scan.nextLine();
            if (!alamat.equals(alamat)) {
                listmahasiswa.get(inputan).setAlamat(alamat);
            }

            System.out.println("Masukkan asalSekolah");
            String AsalSekolah = scan.nextLine();
            if (!AsalSekolah.equals(AsalSekolah)) {
                listmahasiswa.get(inputan).setAsalSekolah(AsalSekolah);
            }

            System.out.println("Masukkan tahun lulus");
            int TahunLulus = scan.nextInt();
            if (TahunLulus >= 0) {
                listmahasiswa.get(inputan).setTahunLulus(TahunLulus);
            }
            System.out.println("Masukkan jurusan");
            String jurusan = scan.nextLine();
            if (!jurusan.equals(jurusan)) {
                listmahasiswa.get(inputan).setJurusan(jurusan);
            }
        }
    }

    void hapus() {
        System.out.println("Masukkan No");
        int hapus = scan.nextInt();
        if (hapus > 0 && --hapus < listmahasiswa.size()) {
            listmahasiswa.remove(hapus);
            System.out.println("\n Data Berhasil Dihapus \n");
        }
          
    }

}
package daftar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import daftar.control.laporanFinal;
import daftar.control.mahasiswacontrol;
import daftar.control.nilaicontrol;
import daftar.model.mahasiswa;
import daftar.model.nilai;
public class app {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        List<mahasiswa> listmahasiswa = new ArrayList<mahasiswa>();
        List<nilai> listnilai = new ArrayList<nilai>();
        do {
            System.out.println("=== SELAMAT DATANG DI PMB 2023 ===");
            System.out.println("[1] DAFTAR ");
            System.out.println("[2] INPUT NILAIRAPORT");
            System.out.println("[3] LAPORAN FINAL MAHASISWA BARU");
            System.out.println("[4] EXIT");
            System.out.println("---------------------");
            System.out.print("Pilih menu> ");
        }while (showMenu(listmahasiswa, listnilai) != 0);
}
    public static int showMenu(List<mahasiswa> lMahasiswas, List<nilai> lnilai) {
        int selectedMenu = Utility.inputInt(scan.nextLine());;
        switch (selectedMenu) {
            case 1:
                new mahasiswacontrol(lMahasiswas);
                break;
            case 2:
                new nilaicontrol(lMahasiswas, lnilai);
                break;
            case 3:
                new laporanFinal(lnilai);
                break;
        }
        return 0;
    }
}
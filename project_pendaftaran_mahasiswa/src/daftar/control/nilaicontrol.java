package daftar.control;
import java.util.List;
import java.util.Scanner;

import daftar.Utility;
import daftar.model.mahasiswa;
import daftar.model.nilai;

public class nilaicontrol {
    private List<mahasiswa>  listmahasiswa;
    private List<nilai>  listnilai;
    Scanner scan = new Scanner(System.in);
    public boolean ceknama(String nama){
    for (nilai a : listnilai) {
        if (a.getNama().equals(nama))
        return false;
        
    }
    return true;

    }

    public nilaicontrol(List<mahasiswa> listmahasiswa, List<nilai> listnilai){
        this.listmahasiswa = listmahasiswa;
        this.listnilai = listnilai;
        showmahasiswa();
        input();

    }
    void showmahasiswa() {
        System.out.println(
                "_____________________________________________________________________________________");
        System.out.println(
                "| NO | Nama Mahasiswa |   alamat   |   asalSekolah    |   TahunLulus   |   Jurusan  |");
        System.out.println(
                "=====================================================================================");
                int i = 1;
                for (mahasiswa Nama : listmahasiswa){
                    System.out.printf("|%-4s|%-16s|%-12s|%-18s|%-16s|%-12s|\n", i++,
                    Nama.getNama(),
                    Nama.getAlamat(),
                    Nama.getAsalSekolah(),
                    Nama.getTahunLulus(),
                    Nama.getjurusan());
                }
    }
    void input(){
        String inputan = "y";
        do{
            System.out.println("\n~Ketik 0 kembali ke menu utama-");
            System.out.println("Input No :");
            int lokasiData = Utility.inputInt(scan.nextLine());
            if (lokasiData > 0 && --lokasiData < listmahasiswa.size()) {
                         
            if(ceknama(listmahasiswa.get(lokasiData).getNama())){

            

                String namaMahasiswa = listmahasiswa.get(lokasiData).getNama();
                listmahasiswa.get(lokasiData).getTahunLulus();
                System.out.println(
                "_____________________________________________________________________________________");
                System.out.println(
                "| NO | Nama Mahasiswa |   alamat   |   asalSekolah    |   TahunLulus   |   Jurusan  |");
                System.out.println(
                "=====================================================================================");
                    System.out.printf("|%-4s|%-16s|%-12s|%-18s|%-16s|%-12s|%n",
                            namaMahasiswa,
                            listmahasiswa.get(lokasiData).getNama(),
                            listmahasiswa.get(lokasiData).getAlamat(),
                            listmahasiswa.get(lokasiData).getAsalSekolah(),
                            listmahasiswa.get(lokasiData).getTahunLulus(),
                            listmahasiswa.get(lokasiData).getjurusan());

                    
                    nilai skor = new nilai();
                    skor.setNama(listmahasiswa.get(lokasiData).getNama());
                    skor.setAlamat(listmahasiswa.get(lokasiData).getAlamat());
                    skor.setAsalSekolah(listmahasiswa.get(lokasiData).getAsalSekolah());
                    skor.setTahunLulus(listmahasiswa.get(lokasiData).getTahunLulus());
                    skor.setJurusan(listmahasiswa.get(lokasiData).getjurusan());
                    System.out.println( "jurusan cek "+listmahasiswa.get(lokasiData).getjurusan());
                    
                    System.out.println("masukkan nilai raport");
                    skor.setNilaiRaport(Utility.inputInt(scan.nextLine()));
                    listnilai.add(skor);

                    show () ;
                  
                    System.out.println("input Berhasil");
                }else{
                    System.out.println("nama sudah di inputkan");
                }
                } else {
                    System.out.println("input anda masukkan tidak ada");
                }      
            

            System.out.println("apakah ingin menginput lagi (Y/N) ? ");
            inputan = scan.nextLine();
         } while (inputan.equalsIgnoreCase("y"));
        
    }

    private void show() {
        System.out.println(
            "__________________________________________________________________________________________________");
    System.out.println(
            "| NO | Nama Mahasiswa |   alamat   |   asalSekolah    |   TahunLulus   |   Jurusan  |   Nilai   ");
    System.out.println(
            "=================================================================================================");
            int i = 1;
            for (nilai n :listnilai){
                System.out.printf("|%-4s|%-16s|%-12s|%-18s|%-16s|%-12s|%-11s|\n",i++,n.getNama(),
                n.getAlamat(),
                n.getAsalSekolah(),
                n.getTahunLulus(),
                n.getJurusan(),
                n.getNilaiRaport());
            }
    }
 }
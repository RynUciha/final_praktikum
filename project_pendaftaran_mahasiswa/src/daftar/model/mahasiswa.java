package daftar.model;

public class mahasiswa {
    private String Nama, alamat, asalSekolah, jurusan;
    private int TahunLulus;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }
    
    public String getjurusan(){
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTahunLulus(){
        return TahunLulus;
    }
    public void setTahunLulus(int TahunLulus) {
        this.TahunLulus = TahunLulus;
    }

    public mahasiswa() {
    }

}
package daftar.model;

public class nilai {
    public static final String listnilai = null;
    private String Nama, alamat, asalSekolah, jurusan;
    private int TahunLulus;
    private float NilaiRaport;   
    
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
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public int getTahunLulus() {
        return TahunLulus;
    }
    public void setTahunLulus(int tahunLulus) {
        TahunLulus = tahunLulus;
    }
    public float getNilaiRaport() {
        return NilaiRaport;
    }
    public void setNilaiRaport(float nilaiRaport) {
        NilaiRaport = nilaiRaport;    
    }
       
    public nilai(){
        
    }
   
}

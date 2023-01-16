package daftar.control;
import java.util.List;
import daftar.model.nilai;

public class laporanFinal {
    private List<nilai> listnilai;
public laporanFinal(List<nilai> listnilai){
    this.listnilai = listnilai;
    showdata();     
    }
    void showdata(){
    System.out.println(
            "___________________________________________________________________________________________________________");
    System.out.println(
            "| NO | Nama Mahasiswa |   alamat   |   asalSekolah    |   TahunLulus   |   Jurusan  |   Nilai   |");
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
                if((n.getNilaiRaport()>65)&&(n.getNilaiRaport()<=100)){
                    System.out.println("LULUS");
                }else if((n.getNilaiRaport()<65)&&(n.getNilaiRaport()>0)){
                    System.out.println("TIDAK LULUS");
                }else{
                    System.out.println("DATA TIDA VALID");
                }               
                }     
            }
        }



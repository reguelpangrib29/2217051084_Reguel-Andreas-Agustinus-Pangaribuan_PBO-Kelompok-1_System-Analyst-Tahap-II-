/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanmodernxyz;

/**
 *
 * @author ASUS
 */
public class Admin {
    public String manajemenAnggota;
    public int manajemenBuku;
    public String laporanAktivitas;
    public int penambahanBuku;

    public Admin(String manajemenAnggota, int manajemenBuku, String laporanAktivitas, int penambahanBuku) {
        this.manajemenAnggota = manajemenAnggota;
        this.manajemenBuku = manajemenBuku;
        this.laporanAktivitas = laporanAktivitas;
        this.penambahanBuku = penambahanBuku;
    }

    public String getManajemenAnggota() {
        return manajemenAnggota;
    }

    public void setManajemenAnggota(String manajemenAnggota) {
        this.manajemenAnggota = manajemenAnggota;
    }

    public int getManajemenBuku() {
        return manajemenBuku;
    }

    public void setManajemenBuku(int manajemenBuku) {
        this.manajemenBuku = manajemenBuku;
    }

    public String getLaporanAktivitas() {
        return laporanAktivitas;
    }

    public void setLaporanAktivitas(String laporanAktivitas) {
        this.laporanAktivitas = laporanAktivitas;
    }

    public int getPenambahanBuku() {
        return penambahanBuku;
    }

    public void setPenambahanBuku(int penambahanBuku) {
        this.penambahanBuku = penambahanBuku;
    }
    
    // Method Tambahan
    
    // Method input_Anggota()
    public void inputAnggota(){
        System.out.println("Input anggota berhasil.");
    }
    
    public void inputAnggota(String namaAnggota){
        System.out.println("Input anggota dengan nama " + namaAnggota + " berhasil.");
    }
    
    // Method input_Buku()
    public void inputBuku(){
        System.out.println("Input buku berhasil.");
    }
    
    public void inputBuku(String judulBuku){
        System.out.println("Input buku dengan judul " + judulBuku + " berhasil.");
    }
    
    // Method input_Laporan_Aktivitas()
    public void inputLaporanAktivitas(){
        System.out.println("Input laporan aktivitas berhasil.");
    }
    
    public void inputLaporanAktivitas(String jenisAktivitas){
        System.out.println("Input laporan aktivitas dengan jenis " + jenisAktivitas + " berhasil.");
    }
    
}

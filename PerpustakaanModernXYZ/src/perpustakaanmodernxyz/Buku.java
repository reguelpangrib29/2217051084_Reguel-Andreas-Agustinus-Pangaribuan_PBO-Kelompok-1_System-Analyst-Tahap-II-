/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanmodernxyz;

/**
 *
 * @author ASUS
 */
public class Buku extends AdminPerpustakaan{
    protected int Nomor_ISBN;
    public String judulBuku;
    public String pengarang;
    public boolean statusKetersediaan;

    public Buku(int Nomor_ISBN, String judulBuku, String pengarang, boolean statusKetersediaan) {
        this.Nomor_ISBN = Nomor_ISBN;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.statusKetersediaan = statusKetersediaan;
    }

    public int getNomor_ISBN() {
        return Nomor_ISBN;
    }

    public void setNomor_ISBN(int Nomor_ISBN) {
        this.Nomor_ISBN = Nomor_ISBN;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
    
    // Method tambahan
    
    // Method untuk input data buku
    public void inputDataBuku(int Nomor_ISBN, String judulBuku, String pengarang, boolean statusKetersediaan){
        this.Nomor_ISBN = Nomor_ISBN;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.statusKetersediaan = statusKetersediaan;
        
        informasiAdminPerpustakaan();
        System.out.println("Data buku berhasil diinput : " + judulBuku);
    }
    
    // Method overloading untuk input data buku tanpa parameter
    public void inputDataBuku(){
        System.out.println("Input data buku non parameter.");
    }
    
    // Method untuk update data buku
    public void updateDataBuku(String judulBuku, String pengarang, boolean statusKetersediaan){
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.statusKetersediaan = statusKetersediaan;
        
        System.out.println("Data buku berhasil di update : " + judulBuku);
    }
    
    // Method untuk delete data buku
    public void deleteDataBuku(){
        System.out.println("Data buku berhasil di hapus : " + judulBuku);
        this.Nomor_ISBN = 0;
        this.judulBuku = null;
        this.pengarang = null;
        this.statusKetersediaan = false;
        
        informasiAdminPerpustakaan();
    }
    
    // Override Method
    @Override
    public void informasiAdminPerpustakaan(){
        System.out.println("Informasi Buku : ");
        System.out.println("Nomor ISBN : " + Nomor_ISBN);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tersedia : " + statusKetersediaan);
        super.informasiAdminPerpustakaan();
    }
   
}

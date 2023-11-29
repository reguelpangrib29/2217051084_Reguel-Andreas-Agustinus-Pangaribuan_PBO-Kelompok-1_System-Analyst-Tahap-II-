/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanmodernxyz;

import java.sql.Time;

/**
 *
 * @author ASUS
 */
public class Notifikasi {
    public Time batasWaktuPinjam;
    public Time batasWaktuPengembalian;
    public String pemberitahuanRestorasi;
    public int penambahanBuku;

    public Notifikasi(Time batasWaktuPinjam, Time batasWaktuPengembalian, String pemberitahuanRestorasi, int penambahanBuku) {
        this.batasWaktuPinjam = batasWaktuPinjam;
        this.batasWaktuPengembalian = batasWaktuPengembalian;
        this.pemberitahuanRestorasi = pemberitahuanRestorasi;
        this.penambahanBuku = penambahanBuku;
    }

    public Time getBatasWaktuPinjam() {
        return batasWaktuPinjam;
    }

    public void setBatasWaktuPinjam(Time batasWaktuPinjam) {
        this.batasWaktuPinjam = batasWaktuPinjam;
    }

    public Time getBatasWaktuPengembalian() {
        return batasWaktuPengembalian;
    }

    public void setBatasWaktuPengembalian(Time batasWaktuPengembalian) {
        this.batasWaktuPengembalian = batasWaktuPengembalian;
    }

    public String getPemberitahuanRestorasi() {
        return pemberitahuanRestorasi;
    }

    public void setPemberitahuanRestorasi(String pemberitahuanRestorasi) {
        this.pemberitahuanRestorasi = pemberitahuanRestorasi;
    }

    public int getPenambahanBuku() {
        return penambahanBuku;
    }

    public void setPenambahanBuku(int penambahanBuku) {
        this.penambahanBuku = penambahanBuku;
    }
    
    // Method Tambahan
    
    // Method untuk input notifikasi
    public void inputNotifikasi(Time batasWaktuPinjam, Time batasWaktuPengembalian, String pemberitahuanRestorasi, int penambahanBuku){
        this.batasWaktuPinjam = batasWaktuPinjam;
        this.batasWaktuPengembalian = batasWaktuPengembalian;
        this.pemberitahuanRestorasi = pemberitahuanRestorasi;
        this.penambahanBuku = penambahanBuku;
        
        System.out.println("Notifikasi berhasil diinput.");
    }
    
    // Method input notifikasi tanpa parameter
    public void inputNotifikasi(){
        System.out.println("Masukkan data notifikasi");
    }
    
    // Method input notifikasi dengan parameter batas waktu peminjaman 
    public void inputNotifikasi(Time batasWaktuPinjam){
        System.out.println("Notifikasi berhasil diinput dengan batas waktu pinjam : " + batasWaktuPinjam);
    }
    
}

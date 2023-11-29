/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanmodernxyz;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author ASUS
 */
public class TransaksiPeminjaman extends AdminPerpustakaan{
    public Date tanggalPeminjaman;
    public Time waktuPeminjaman;
    public Date durasiPeminjaman;

    public TransaksiPeminjaman(Date tanggalPeminjaman, Time waktuPeminjaman, Date durasiPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.waktuPeminjaman = waktuPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Time getWaktuPeminjaman() {
        return waktuPeminjaman;
    }

    public void setWaktuPeminjaman(Time waktuPeminjaman) {
        this.waktuPeminjaman = waktuPeminjaman;
    }

    public Date getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(Date durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
    
    
    // Method Tambahan
    
    // Override Method
    @Override
    public void informasiAdminPerpustakaan() {
        System.out.println("Informasi Transaksi Peminjaman:");
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        super.informasiAdminPerpustakaan();
    }
    
    // Method input transaksi peminjaman dengan nilai default untuk durasi peminjaman
    public void inputTransaksi(Date tanggalPeminjaman, Time waktuPeminjaman){
        inputTransaksi(tanggalPeminjaman, waktuPeminjaman, null);
    }
    
    // Method input transaksi peminjaman
    public void inputTransaksi(Date tanggalPeminjaman, Time waktuPeminjaman, Date durasiPeminjaman){
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.waktuPeminjaman = waktuPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
        System.out.println("Transaksi peminjaman berhasil diinput pada tanggal : " + tanggalPeminjaman);
    }
}

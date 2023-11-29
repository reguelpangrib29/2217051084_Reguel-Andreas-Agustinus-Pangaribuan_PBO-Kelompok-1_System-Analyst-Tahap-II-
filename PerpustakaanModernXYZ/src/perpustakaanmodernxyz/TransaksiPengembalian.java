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
public class TransaksiPengembalian extends AdminPerpustakaan {
    public Date tanggalPengembalian;
    public Time waktuPengembalian;
    public Date durasiPengembalian;

    public TransaksiPengembalian(Date tanggalPengembalian, Time waktuPengembalian, Date durasiPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktuPengembalian = waktuPengembalian;
        this.durasiPengembalian = durasiPengembalian;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Time getWaktuPengembalian() {
        return waktuPengembalian;
    }

    public void setWaktuPengembalian(Time waktuPengembalian) {
        this.waktuPengembalian = waktuPengembalian;
    }

    public Date getDurasiPengembalian() {
        return durasiPengembalian;
    }

    public void setDurasiPengembalian(Date durasiPengembalian) {
        this.durasiPengembalian = durasiPengembalian;
    }
    
    
    // Method Tambahan
    
    // Override Method
    @Override
    public void informasiAdminPerpustakaan() {
        System.out.println("Informasi Transaksi Pengembalian:");
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian);
        super.informasiAdminPerpustakaan();
    }
    
    // Method untuk input transaksi pengembalian dengan nilai default untuk durasiPengembalian
    public void inputTransaksi(Date tanggalPengembalian, Time waktuPengembalian) {
        inputTransaksi(tanggalPengembalian, waktuPengembalian, null);
    }
    
    // Method untuk input transaksi pengembalian
    public void inputTransaksi(Date tanggalPengembalian, Time waktuPengembalian, Date durasiPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktuPengembalian = waktuPengembalian;
        this.durasiPengembalian = durasiPengembalian;
        System.out.println("Transaksi pengembalian berhasil diinput pada tanggal: " + tanggalPengembalian);
    }
}

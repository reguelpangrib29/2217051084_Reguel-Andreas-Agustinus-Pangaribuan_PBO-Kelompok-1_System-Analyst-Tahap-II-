/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaanmodernxyz;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;

/**
 *
 * @author ASUS
 */

class AdminPerpustakaan {
    public ArrayList<String> daftarKategori;
    public int jumlahBukuTotal;
    public ArrayList<String> daftarAnggota;
    public int jumlahTransaksiPeminjaman;
    public int jumlahTransaksiPengembalian; 

    public AdminPerpustakaan(ArrayList<String> daftarKategori, int jumlahBukuTotal, ArrayList<String> daftarAnggota, int jumlahTransaksiPeminjaman, int jumlahTransaksiPengembalian) {
        this.daftarKategori = daftarKategori;
        this.jumlahBukuTotal = jumlahBukuTotal;
        this.daftarAnggota = daftarAnggota;
        this.jumlahTransaksiPeminjaman = jumlahTransaksiPeminjaman;
        this.jumlahTransaksiPengembalian = jumlahTransaksiPengembalian;
    }

    public AdminPerpustakaan(){
        this(new ArrayList<>(), 10, new ArrayList<>(), 0, 0);
    }
    
    // Method Umum
    public void tambahKategori(String kategori){
        daftarKategori.add(kategori);
        System.out.println("Kategori baru berhasil ditambahkan : " + kategori);
    }
    
    public void hapusKategori(String kategori){
        if (daftarKategori.contains(kategori)){
            daftarKategori.remove(kategori);
            System.out.println("Kategori berhasil dihapus : " + kategori);
        } else {
            System.out.println("Kategori tidak ditemukan");
        }
    }
    
    public void cetakDaftarKategori() {
        System.out.println("Daftar Kategori:");
        for (String kategori : daftarKategori) {
            System.out.println("- " + kategori);
        }
    }
        
    public void tambahBuku(int jumlah) {
        jumlahBukuTotal += jumlah;
        System.out.println("Jumlah total buku berhasil ditambahkan : " + jumlah);
    }
    
    public void kurangiBuku(int jumlah) {
        if (jumlahBukuTotal >= jumlah) {
            jumlahBukuTotal -= jumlah;
            System.out.println("Jumlah total buku berhasil dikurangi: " + jumlah);
        } else {
            System.out.println("Jumlah total buku tidak mencukupi.");
        }
    }
    
    public void tambahAnggota(String namaAnggota) {
        daftarAnggota.add(namaAnggota);
        System.out.println("Anggota baru berhasil ditambahkan: " + namaAnggota);
    }

    public void hapusAnggota(String namaAnggota) {
        if (daftarAnggota.contains(namaAnggota)) {
            daftarAnggota.remove(namaAnggota);
            System.out.println("Anggota " + namaAnggota + " berhasil dihapus.");
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }
    
    public void cetakDaftarAnggota(){
        System.out.println("Daftar Anggota : ");
        for (String anggota : daftarAnggota){
            System.out.println("- " + anggota);
        }
    }
    
    public void tambahTransaksiPeminjaman(){
        jumlahTransaksiPeminjaman++;
        System.out.println("Jumlah transaksi peminjaman berhasil ditambahkan.");
    }
    
    public void tambahTransaksiPengembalian() {
        jumlahTransaksiPengembalian++;
        System.out.println("Jumlah transaksi pengembalian berhasil ditambahkan.");
    }
    
    public void informasiAdminPerpustakaan() {
        System.out.println("Informasi Admin Perpustakaan:");
        System.out.println("Jumlah Total Buku : " + jumlahBukuTotal);
        cetakDaftarKategori();
        System.out.println("Jumlah Total Anggota : " + daftarAnggota.size());
        cetakDaftarAnggota();
        System.out.println("Jumlah Total Transaksi Peminjaman : " + jumlahTransaksiPeminjaman);
        System.out.println("Jumlah Total Transaksi Pengembalian : " + jumlahTransaksiPengembalian);
    }
    
}


public class PerpustakaanModernXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Admin Perpustakaan
        AdminPerpustakaan perpustakaan = new AdminPerpustakaan();
        perpustakaan.tambahKategori("Fiksi");
        perpustakaan.tambahKategori("Non-Fiksi");
        perpustakaan.cetakDaftarAnggota();
        perpustakaan.tambahBuku(100);
        perpustakaan.tambahAnggota("Reguel Andreas Agustinus Pangaribuan");
        perpustakaan.tambahAnggota("Muhammad Hildan Alfaris");
        perpustakaan.tambahAnggota("Muhammad Habibullah Al Hikam");
        perpustakaan.cetakDaftarAnggota();
        perpustakaan.tambahTransaksiPeminjaman();
        perpustakaan.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        
        //Anggota
        Anggota anggota1 = new Anggota(110, "Reguel Andreas Agustinus Pangaribuan", "Medan", new Date());
        Anggota anggota2 = new Anggota(120, "Muhammad Hildan Alfaris", "Bandar Lampung", new Date());
        Anggota anggota3 = new Anggota(130, "Muhammad Habibullah Al Hikam", "Bandar Lampung", new Date());
        anggota1.printData();
        anggota1.datangKePerpustakaan();
        anggota1.updateAlamat("Bandar Lampung");
        
        System.out.println(" ");
        anggota2.printData();
        anggota2.datangKePerpustakaan();
        anggota2.updateAlamat("Jakarta Selatan");
        
        System.out.println(" ");
        anggota3.printData();
        anggota3.datangKePerpustakaan();
        anggota3.updateAlamat("Bandung Barat");
        
        System.out.println(" ");
        
        //Buku
        Buku bukuBaru = new Buku(979763, "Teori Bahasa dan Automata", "Jane Khosasih", true);
        System.out.println(" ");
        bukuBaru.informasiAdminPerpustakaan();
        System.out.println(" ");
        bukuBaru.inputDataBuku(976783, "Pemrograman Berorientasi Objek", "Cyntia Lauren", true);
        System.out.println(" ");
        bukuBaru.informasiAdminPerpustakaan();
        bukuBaru.deleteDataBuku();
        bukuBaru.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        
        //Transaksi Peminjaman
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(new Date(), new Time(12,0,0), new Date());
        transaksi1.informasiAdminPerpustakaan();
        transaksi1.inputTransaksi(new Date(), new Time(14, 30, 0));
        transaksi1.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman(new Date(), new Time(12,30,0), new Date());
        transaksi2.informasiAdminPerpustakaan();
        transaksi2.inputTransaksi(new Date(), new Time(14, 30, 0));
        transaksi2.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        TransaksiPeminjaman transaksi3 = new TransaksiPeminjaman(new Date(), new Time(13,0,0), new Date());
        transaksi3.informasiAdminPerpustakaan();
        transaksi3.inputTransaksi(new Date(), new Time(15, 0, 0));
        transaksi3.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        
        //Transaksi Pengembalian
        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian(new Date(), new Time(15, 0, 0), new Date());
        TransaksiPengembalian pengembalian2 = new TransaksiPengembalian(new Date(), new Time(15, 40, 0), new Date());
        TransaksiPengembalian pengembalian3 = new TransaksiPengembalian(new Date(), new Time(16, 0, 0), new Date());


        pengembalian1.informasiAdminPerpustakaan();
        pengembalian1.inputTransaksi(new Date(), new Time(16, 0, 0));
        pengembalian1.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        pengembalian2.informasiAdminPerpustakaan();
        pengembalian2.inputTransaksi(new Date(), new Time(16, 30, 0));
        pengembalian2.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        pengembalian3.informasiAdminPerpustakaan();
        pengembalian3.inputTransaksi(new Date(), new Time(16, 30, 0));
        pengembalian3.informasiAdminPerpustakaan();
        
        System.out.println(" ");
        
        //Notifikasi
        Notifikasi mynotifikasi = new Notifikasi(new Time(18, 0, 0), new Time(19, 0, 0), "Buku Anda akan jatuh tempo", 10);
        mynotifikasi.inputNotifikasi();
        mynotifikasi.inputNotifikasi(new Time(20, 0, 0));
        
        System.out.println(" ");
        
        //Admin
        Admin myadmin = new Admin("Manajemen Anggota", 200, "Laporan Peminjaman", 10);
        System.out.println("<=============================================>");
        myadmin.inputAnggota();
        myadmin.inputBuku();
        myadmin.inputLaporanAktivitas();
        myadmin.inputAnggota("Muhammad Hildan Alfaris");
        myadmin.inputBuku("Teori Bahasa dan Automata");
        myadmin.inputLaporanAktivitas("Laporan Pengembalian");
        System.out.println("<=============================================>");
        
    }
    
}

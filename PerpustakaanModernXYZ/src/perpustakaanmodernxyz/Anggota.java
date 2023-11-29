/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanmodernxyz;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Anggota {
    protected int nomorAnggota;
    public String namaAnggota;
    public String alamat;
    public Date sejarahPeminjaman;

    public Anggota(int nomorAnggota, String namaAnggota, String alamat, Date sejarahPeminjaman) {
        this.nomorAnggota = nomorAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.sejarahPeminjaman = sejarahPeminjaman;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getSejarahPeminjaman() {
        return sejarahPeminjaman;
    }

    public void setSejarahPeminjaman(Date sejarahPeminjaman) {
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
    
    // Method Tambahan
    public void printData(){
        System.out.println(" ");
        System.out.println("Nama Anggota\t : " + namaAnggota);
        System.out.println("ID Anggota\t : " + nomorAnggota);
    }
    
    public void datangKePerpustakaan(){
        System.out.println("Datang ke Perpustakaan dengan nama anggota " + getNamaAnggota());
    }
    
    public void updateAlamat(String alamatBaru) {
        this.alamat = alamatBaru;
        System.out.println("Alamat " + namaAnggota + " diperbarui menjadi : " + alamat);

    }
   
}

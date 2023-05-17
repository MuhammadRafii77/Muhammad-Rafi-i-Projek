/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Tugas {
    
    // Atribut
    private int id;
    private String nama;
    private String deskripsi;
    private MataPelajaran mataPelajaran;
    
    // Konstruktor
    public Tugas(int id, String nama, String deskripsi, MataPelajaran mataPelajaran) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.mataPelajaran = mataPelajaran;
    }
    
    // Metode
    public void kumpulkan(Siswa siswa) {
        System.out.println(siswa.getNama() + " telah mengumpulkan tugas: " + nama);
    }
    
    // Properti
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
    public class Guru {
    
    // Atribut
    private int id;
    private String nama;
    private String mataPelajaran;
    
    // Konstruktor
    public Guru(int id, String nama, String mataPelajaran) {
        this.id = id;
        this.nama = nama;
        this.mataPelajaran = mataPelajaran;
    }
    
    // Metode
    public void mengajar() {
        System.out.println(nama + " sedang mengajar " + mataPelajaran + ".");
    }
    
    // Properti
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }
    
}



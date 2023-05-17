/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Siswa {
    
    // Atribut
    private int id;
    private String nama;
    private int tingkatKelas;
    
    // Konstruktor
    public Siswa(int id, String nama, int tingkatKelas) {
        this.id = id;
        this.nama = nama;
        this.tingkatKelas = tingkatKelas;
    }
    
    // Metode
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
    
    // Properti
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getTingkatKelas() {
        return tingkatKelas;
    }
    
}


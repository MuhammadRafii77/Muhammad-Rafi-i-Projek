/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class MataPelajaran {
    
    // Atribut
    private int id;
    private String nama;
    private Guru guru;
    
    // Konstruktor
    public MataPelajaran(int id, String nama, Guru guru) {
        this.id = id;
        this.nama = nama;
        this.guru = guru;
    }
    
    // Metode
    public void mulai() {
        System.out.println("Mata pelajaran " + nama + " telah dimulai dengan guru " + guru.getNama() + ".");
    }
    
    // Properti
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Guru getGuru() {
        return guru;
    }
    
}


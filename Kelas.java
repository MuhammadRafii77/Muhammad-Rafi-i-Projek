/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Kelas {
   
    // Atribut
    private  int id;
    private String nama;
    private int jumlahSiswa;
    
    // Konstruktor
    public Kelas(int id, String nama, int jumlahSiswa) {
        this.id = id;
        this.nama = nama;
        this.jumlahSiswa = jumlahSiswa;
    }
    
    // Metode
    public void setJumlahSiswa(int jumlahSiswa) {
        this.jumlahSiswa = jumlahSiswa;
    }
    
    
    public void info() {
        System.out.println(nama + " memiliki " + jumlahSiswa + " siswa.");
    }
    
    // Properti
    public int getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getJumlahSiswa() {
        return jumlahSiswa;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
   }

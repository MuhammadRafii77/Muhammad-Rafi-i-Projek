/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Nilai {
    
    // Atribut
    private  Tugas tugas;
    private  Siswa siswa;
    private int skor;
    
    // Konstruktor
    public Nilai(Tugas tugas, Siswa siswa, int skor) {
        this.tugas = tugas;
        this.siswa = siswa;
        this.skor = skor;
    }
    
    // Metode
    public void perbaruiSkor(int skor) {
        this.skor = skor;
        System.out.println("Skor untuk " + siswa.getNama() + " pada tugas " + tugas.getNama() + " telah diperbarui menjadi " + skor);
    }
    
    // Properti
    public Tugas getTugas() {
        return tugas;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public int getSkor() {
        return skor;
    }
    
}


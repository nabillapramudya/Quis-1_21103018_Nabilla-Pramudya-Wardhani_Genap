/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi5.projectpenduduk;

/**
 *
 * @author HP
 */
public class Dokter extends Penduduk {
     int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jmlPasien * 50.000) + (jmlObat * 10.000);
    }
}



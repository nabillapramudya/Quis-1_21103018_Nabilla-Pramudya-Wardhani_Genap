/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi5.projectpenduduk;

/**
 *
 * @author HP
 * 
 */
public class Nelayan extends Penduduk {
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;
            
    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar * 10.000);
    }
    public void tampilDataNelayan(){
        tampilDataPenduduk();
         System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }     
}



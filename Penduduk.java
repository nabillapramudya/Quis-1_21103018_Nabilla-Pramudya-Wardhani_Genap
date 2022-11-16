/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi5.projectpenduduk;

/**
 *
 * @author HP
 * Nabilla Pramudya Wardhani
 * 21103018
 */
public class Penduduk {
    String nik;
    String nama;
    int umur;
    String alamat;

    public void tampilDataPenduduk() {
        System.out.println("Data Penduduk : ");
        System.out.println();
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
    }
}
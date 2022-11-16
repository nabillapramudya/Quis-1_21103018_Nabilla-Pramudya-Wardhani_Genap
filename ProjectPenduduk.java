/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package materi5.projectpenduduk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 * Nabilla Pramudya Wardhani
 * 21103018
 */
public class ProjectPenduduk {

    public static void main(String[] args) {
        //Menambahkan object
        Nelayan n1 = new Nelayan();
        Nelayan n2 = new Nelayan();
        Dokter d1 = new Dokter();
        Dokter d2 = new Dokter();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Masukkan Data Nelayan\n");
            System.out.println("------------------------\n");
            System.out.println("NIK : ");
            n1.nik = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Umur : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar = Integer.parseInt(br.readLine());
            System.out.println("Total Pendapatan :");
            n1.totalPendapatNelayan = Integer.parseInt(br.readLine());
          
            System.out.println();

            System.out.println("Masukkan Data Nelayan\n");
            System.out.println("------------------------\n");
            System.out.println("NIK : ");
            n2.nik = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Umur : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jmlSolar = Integer.parseInt(br.readLine());
            System.out.println("");
             System.out.println("Total Pendapatan :");
            n2.totalPendapatNelayan = Integer.parseInt(br.readLine());

            System.out.println("Masukkan Data Dokter\n");
            System.out.println("--------------------\n");
            System.out.println("NIK : ");
            d1.nik = br.readLine();
            System.out.println("Nama : ");
            d1.nama = br.readLine();
            System.out.println("Umur : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jmlObat = Integer.parseInt(br.readLine());
            System.out.println("Total Pendapatan :");
            d1.totalPendapatanDokter = Integer.parseInt(br.readLine());
            

            System.out.println();

            System.out.println("Masukkan Data Dokter\n");
            System.out.println("--------------------\n");
            System.out.println("NIK : ");
            d2.nik = br.readLine();
            System.out.println("Nama : ");
            d2.nama = br.readLine();
            System.out.println("Umur : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.println("Total Pendapatan :");
            d2.totalPendapatanDokter = Integer.parseInt(br.readLine());
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.tampilDataNelayan();
            n1.totalPendapatNelayan();
            
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.tampilDataNelayan();
            n2.totalPendapatNelayan();
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk();
            d1.DataDokter();
            d1.totalPendapatanDokter();
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.DataDokter();
            d2.totalPendapatanDokter();

        } catch (IOException eox) // menangkap kesalahan
      
        {
            System.out.println(eox);
        }
    }
}

    


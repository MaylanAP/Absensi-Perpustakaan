package com.company;
import java.util.Scanner;

class absensi{
    String nama, ket;
    int tanggal;

    absensi(int inTanggal, String inNama, String inKet){
        this.tanggal = inTanggal;
        this.nama = inNama;
        this.ket = inKet;
    }

    void tampil(){
        System.out.println("Tanggal : " + this.tanggal);
        System.out.print(this.nama);
        System.out.print(" -> " + this.ket);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        absensi orang1 = new absensi(18,"Maylan", "Hadir");
        orang1.tampil();

        System.out.println(" ");
        System.out.println("Selanjutnya = ");
        System.out.println("1. Next");
        System.out.println("2. Stop");
        System.out.print("Pilihan : ");
        pil = input.nextInt();
        if (pil==1){
            System.out.println("Tambah data");
            absensi orang2 = new absensi(18,"Anggi", "Izin");
            orang2.tampil();
        } else {
            System.out.println("Program selesai");
        }

    }

}
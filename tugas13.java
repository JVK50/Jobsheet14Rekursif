package jobsheet14;

import java.util.Scanner;

public class tugas13 {
    static Scanner inputan = new Scanner(System.in);

    public static void main(String[] args) {

       System.out.print("Masukkan jumlah angka yang ingin dihitung (N) : ");
       int inputJumlahAngka = inputan.nextInt();

       
       System.out.println("Total dari " + inputJumlahAngka + " angka yang dimasukkan adalah : " + Rekursif(inputJumlahAngka));

       System.out.println("Total dari " + inputJumlahAngka + " angka yang dimasukkan adalah : " + Iteratif(inputJumlahAngka));
    }


    

    public static int Rekursif(int angkaRekursif){
        if (angkaRekursif == 0) {
            return (0);
        }else{
            System.out.print("Masukkan angka ke " + angkaRekursif + " : ");
            int inputRekrusif = inputan.nextInt();
            int jumlahSeluruhnya =+ inputRekrusif;
            
            return  jumlahSeluruhnya + Rekursif(angkaRekursif-1);
        }

    }


    
    public static int Iteratif(int angkaIteratif) {
        int jumlahSeluruhnya = 0;

        for (int i = angkaIteratif; i > 0; i--) {
            System.out.print("Masukkan angka ke - " + i + ": ");
            int inputIteratif = inputan.nextInt();
            jumlahSeluruhnya += inputIteratif;
        }
        return jumlahSeluruhnya;
    }
}

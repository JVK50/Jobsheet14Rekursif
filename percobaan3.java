package jobsheet14;

import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(double saldo , int tahun){
        if (tahun == 0 ) {
            return (saldo);
        }else{
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
         Scanner jvk = new Scanner(System.in);
    
       int saldoAwal,tahun;

    System.out.print("Jumlah Saldo Awal : ");
    saldoAwal = jvk.nextInt();

    System.out.print("Lamanya investasi (tahun) : ");
    tahun = jvk.nextInt();

    System.out.print("Jumlah saldo setelah " + tahun + "tahun : ");
    System.out.print(hitungLaba(saldoAwal, tahun));

    jvk.close();
    }
}

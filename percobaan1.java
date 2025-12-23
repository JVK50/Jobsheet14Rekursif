package jobsheet14;

public class percobaan1 {
    static int factorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRekursif(n - 1);
        }
    }
    static int factorialIteratif(int n) {
        int hasil = 1;
        for (int i = n; i >= n; i--) {
            hasil = hasil * i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println(factorialRekursif(0));
        System.out.println(factorialIteratif(5));
    }
}

package jobsheet14;
import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return (x * hitungPangkat(x, y - 1)); 
        }
    }
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = jvk.nextInt();
        System.out.print("Pangkat yang dihitung: ");
        int pangkat = jvk.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        jvk.close();

        System.out.print("hitungPangkat" + "(" + bilangan + "," + pangkat + ")" + " " + "dicetak" + " ");
         for (int i = 0; i < pangkat ; i++) {
             System.out.print( bilangan + " x ");
            }

            
        int hasil =  hitungPangkat(bilangan, pangkat);
        System.out.print("1" + "" + " = "+ hasil);
    }
}

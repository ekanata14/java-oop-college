
import java.util.Scanner;

public class NomorEmpat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("PENGULANGAN BILANGAN GENAP");
        System.out.println("====================================");

        System.out.print("Masukkan batas bilangan: ");
        int batasBilangan = input.nextInt();
        System.out.println("====================================");

        System.out.println("Bilangan genap dari 1 sampai " + batasBilangan + ":");
        for (int i = 1; i <= batasBilangan; i++) {
            if (i % 2 == 0) {
                if (i == batasBilangan || i == batasBilangan - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}

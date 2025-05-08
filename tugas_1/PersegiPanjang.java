
import java.util.Scanner;

public class PersegiPanjang {

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("PROGRAM MENGHITUNG PERSEGI PANJANG");
        System.out.println("-------------------------------");

        boolean isContinue = true; // Variabel untuk mengecek apakah user ingin melanjutkan perhitungan
        boolean isValid = false;  // Variabel untuk mengecek validasi input pilihanTipeHitung user
        boolean isNext = false; // Variabel untuk mengecek validasi input ketika user ingin melakukan perhitungan lagi atau tidak 
        int pilihTipeHitungInteger = 0;

        while (isContinue) {
            // Mengambil object scanner untuk input user
            Scanner myScanner = new Scanner(System.in);

            while (!isValid) {
                System.out.println("---------------------------");
                System.out.println("Tipe Hitung: ");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.println("3. Luas dan Keliling");
                System.out.println("---------------------------");
                System.out.print("Masukkan Pilihan (1,2,3): ");
                String pilihTipeHitung = myScanner.nextLine();
                pilihTipeHitungInteger = Integer.parseInt(pilihTipeHitung);
                if (pilihTipeHitungInteger > 3 || pilihTipeHitungInteger < 1) {
                    System.out.println("---------------------------");
                    System.out.println("!!!! WARNING !!!!");
                    System.out.println("---------------------------");
                    System.out.println("Pilihan tidak valid, silahkan masukkan pilihan yang benar");
                    System.out.println("---------------------------");
                    System.out.println("!!!! WARNING !!!!");
                    isValid = false;
                } else {
                    isValid = true;
                }
            }

            // Memasukkan nilai panjang
            System.out.println("---------------------------");
            System.out.print("Masukkan Panjang: ");
            String inputPanjang = myScanner.nextLine();

            // Memasukkan nilai lebar
            System.out.println("---------------------------");
            System.out.print("Masukkan Lebar: ");
            String inputLebar = myScanner.nextLine();

            // Mengubah input user dari tipe String menjadi integer
            int panjang = Integer.parseInt(inputPanjang);
            int lebar = Integer.parseInt(inputLebar);

            // Mendeklarasikan variabel luas dan keliling persegi panjang
            int luasPersegiPanjang = 0;
            int kelilingPersegiPanjang = 0;

            // Menampilkan dan memproses hasil perhitungan
            if (pilihTipeHitungInteger == 1) {
                System.out.println("---------------------------");
                System.out.println("|||||| HASIL PERHITUNGAN LUAS ||||||");
                luasPersegiPanjang = panjang * lebar;
                System.out.println("---------------------------");
                System.out.println("Luas: " + luasPersegiPanjang);
                System.out.println("---------------------------");
                isNext = false;
            } else if (pilihTipeHitungInteger == 2) {
                System.out.println("---------------------------");
                System.out.println("|||||| HASIL PERHITUNGAN KELILING ||||||");
                kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println("---------------------------");
                System.out.println("Keliling: " + kelilingPersegiPanjang);
                System.out.println("---------------------------");
                isNext = false;
            } else if (pilihTipeHitungInteger == 3) {
                System.out.println("---------------------------");
                System.out.println("|||||| HASIL PERHITUNGAN LUAS & KELILING ||||||");
                luasPersegiPanjang = panjang * lebar;
                kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println("---------------------------");
                System.out.println("Luas: " + luasPersegiPanjang);
                System.out.println("---------------------------");
                System.out.println("Keliling: " + kelilingPersegiPanjang);
                System.out.println("---------------------------");
                isNext = false;
            }

            // Menanyakan user apakah ingin lanjut menghitung atau tidak
            while (!isNext) {
                System.out.print("Lanjutkan Menghitung? (y/n): ");
                String lanjutkanMenghitung = myScanner.nextLine();
                if (lanjutkanMenghitung.equals("n")) {
                    isContinue = false;
                    isNext = false;
                    break;
                } else if(lanjutkanMenghitung.equals("y")) {
                    isContinue = true;
                    isNext = true;
                    isValid = false;
                } else{
                    System.out.println("---------------------------");
                    System.out.println("!!!! WARNING !!!!");
                    System.out.println("---------------------------");
                    System.out.println("Pilihan tidak valid, silahkan masukkan pilihan yang benar");
                    System.out.println("---------------------------");
                    System.out.println("!!!! WARNING !!!!");
                    System.out.println("---------------------------");
                    isNext = false;
                }
            }
        }
    }
}

import java.util.Scanner;

public class SegitigaSikuSiku {

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("PROGRAM MENGHITUNG SEGITIGA SIKU-SIKU");
        System.out.println("-------------------------------");

        boolean isContinue = true; // Variabel untuk mengecek apakah user ingin melanjutkan perhitungan
        boolean isValid = false;  // Variabel untuk mengecek validasi input pilihanTipeHitung user
        boolean isNext = false; // Variabel untuk mengecek validasi input ketika user ingin melakukan perhitungan lagi atau tidak 
        int pilihTipeHitungInteger = 0;

        while (isContinue) {
            // Mengambil object scanner untuk input user
            Scanner myScanner = new Scanner(System.in);

            // Memilih dan mengecek apakah pilihan tipe hitung valid atau tidak
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
                    System.out.println("---------------------------");
                    isValid = false;
                } else {
                    isValid = true;
                }
            }

            // Menampilkan dan memproses hasil perhitungan
            if (pilihTipeHitungInteger == 1) {
                System.out.println("---------------------------");
                System.out.println("|||||| MENGHITUNG LUAS ||||||");
                // Memasukkan nilai panjang
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai Alas: ");
                String inputAlas = myScanner.nextLine();

                // Memasukkan nilai lebar
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai Tinggi: ");
                String inputTinggi = myScanner.nextLine();

                int alas = Integer.parseInt(inputAlas);
                int tinggi = Integer.parseInt(inputTinggi);

                int hasilLuas = (alas * tinggi) / 2;

                System.out.println("---------------------------");
                System.out.println("Luas Segitiga Siku-Siku: " + hasilLuas);
                System.out.println("---------------------------");
                isNext = false;
            } else if (pilihTipeHitungInteger == 2) {
                System.out.println("---------------------------");
                System.out.println("|||||| MENGHITUNG KELILING ||||||");
                // Memasukkan nilai sisi A
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi A: ");
                String inputSisiA = myScanner.nextLine();

                // Memasukkan nilai sisi B
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi B: ");
                String inputSisiB = myScanner.nextLine();

                // Memasukkan nilai sisi C
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi C: ");
                String inputSisiC = myScanner.nextLine();

                int sisiA = Integer.parseInt(inputSisiA);
                int sisiB = Integer.parseInt(inputSisiB);
                int sisiC = Integer.parseInt(inputSisiC);

                int hasilKeliling = sisiA + sisiB + sisiC;

                System.out.println("---------------------------");
                System.out.println("Keliling Segitiga Siku-Siku: " + hasilKeliling);
                System.out.println("---------------------------");
                isNext = false;
            } else if (pilihTipeHitungInteger == 3) {
                System.out.println("---------------------------");
                System.out.println("|||||| MENGHITUNG LUAS ||||||");
                // Memasukkan nilai panjang
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai Alas: ");
                String inputAlas = myScanner.nextLine();

                // Memasukkan nilai lebar
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai Tinggi: ");
                String inputTinggi = myScanner.nextLine();

                int alas = Integer.parseInt(inputAlas);
                int tinggi = Integer.parseInt(inputTinggi);

                int hasilLuas = (alas * tinggi) / 2;

                System.out.println("---------------------------");
                System.out.println("|||||| MENGHITUNG KELILING ||||||");
                // Memasukkan nilai sisi A
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi A: ");
                String inputSisiA = myScanner.nextLine();

                // Memasukkan nilai sisi B
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi B: ");
                String inputSisiB = myScanner.nextLine();

                // Memasukkan nilai sisi C
                System.out.println("---------------------------");
                System.out.print("Masukkan Nilai sisi C: ");
                String inputSisiC = myScanner.nextLine();

                int sisiA = Integer.parseInt(inputSisiA);
                int sisiB = Integer.parseInt(inputSisiB);
                int sisiC = Integer.parseInt(inputSisiC);

                int hasilKeliling = sisiA + sisiB + sisiC;

                System.out.println("---------------------------");
                System.out.println("|||||| HASIL PERHITUNGAN LUAS & KELILING||||||");
                System.out.println("---------------------------");
                System.out.println("Luas Segitiga Siku-Siku: " + hasilLuas);
                System.out.println("---------------------------");
                System.out.println("Keliling Segitiga Siku-Siku: " + hasilKeliling);
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
                } else if (lanjutkanMenghitung.equals("y")) {
                    isContinue = true;
                    isNext = true;
                    isValid = false;
                } else {
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

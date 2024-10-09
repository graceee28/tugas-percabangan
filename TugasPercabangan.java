import java.util.Scanner;

public class TugasPercabangan {
    public static void main(String[] args) {
        
        int GAJI_POKOK = 5000000;
        int UANG_LEMBUR_PER_JAM = 50000;
        int masaKerja, jamKerja, jamLembur;
        double tambahan, totalGaji;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        jamKerja = scanner.nextInt();

        
        if (jamKerja > 40) { // 240 jam = 8 jam/hari * 30 hari
            jamLembur = jamKerja - 40;
        } else {
            jamLembur = 0;
        }

        
        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = GAJI_POKOK * 0.05; // Tambahan 5%
        } else {
            tambahan = GAJI_POKOK * 0.10; // Tambahan 10%
        }

        
        totalGaji = GAJI_POKOK + tambahan + (jamLembur * UANG_LEMBUR_PER_JAM);

        
        System.out.println("Total gaji yang diterima adalah: Rp " + totalGaji);

        
        scanner.close();
    }
}



// Deklarasi
// Var gajiPokok = 5000000;
//     uangLembur = 50000;
//     masaKerja;
//     jamKerja;
//     jumlahJamKerja;
//     jumlahJamLembur;
//     : integer;
//     totalGaji;
//     bonus;
//     : double;

// Algoritma
//          input(masaKerja);
//          input(jamKerja);
// if (masa kerja <5 tahun) then
//  output (bonus = 0);
// else if (masa kerja>= 5 && masaKerja <= 10 ) then 
//  output (bonus = 0,05 *uangLembur);
//  else(masa kerja > 10 tahun) then
//  output (bonus = 0,01)

// End

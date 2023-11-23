import java.util.Scanner;

public class NilaiTugasLimaMahasiswa08 {

    static int JUMLAH_MAHASISWA = 5;
    static int JUMLAH_MINGGU = 7;

    static int[][] nilaiTugas = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        inputNilaiTugas();
        tampilkanNilaiTugas();
        cariHariTerbaik();
        tampilkanMahasiswaTerbaik();
    }

    static void inputNilaiTugas() {
        Scanner input08 = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Masukkan nilai tugas untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiTugas[i][j] = input08.nextInt();
            }
        }

        input08.close();
    }

    static void tampilkanNilaiTugas() {
        System.out.println("\nNilai Tugas Lima Mahasiswa:");
        System.out.println("==============================================================");
        System.out.printf("%-8s", "Nama");
        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            System.out.printf("%-8s", "Minggu " + (j + 1));
        }
        System.out.println("\n============================================================");

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.printf("%-8s", namaMahasiswa[i]);
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.printf("%-8d", nilaiTugas[i][j]);
            }
            System.out.println();
        }

        System.out.println("==============================================================");
    }

    static void cariHariTerbaik() {
        int[] totalNilaiHari = new int[JUMLAH_MINGGU];

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilaiHari[j] += nilaiTugas[i][j];
            }
        }

        int hariTerbaik = 0;
        for (int j = 1; j < JUMLAH_MINGGU; j++) {
            if (totalNilaiHari[j] > totalNilaiHari[hariTerbaik]) {
                hariTerbaik = j;
            }
        }

        System.out.println("\nHari terbaik adalah Minggu ke-" + (hariTerbaik + 1) + " dengan total nilai " + totalNilaiHari[hariTerbaik]);
    }

    static void tampilkanMahasiswaTerbaik() {
        int mahasiswaTerbaik = 0;
        int mingguTerbaik = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                if (nilaiTugas[i][j] > nilaiTugas[mahasiswaTerbaik][mingguTerbaik]) {
                    mahasiswaTerbaik = i;
                    mingguTerbaik = j;
                }
            }
        }

        System.out.println("\nMahasiswa terbaik adalah " + namaMahasiswa[mahasiswaTerbaik] +
                " dengan nilai tertinggi pada Minggu ke-" + (mingguTerbaik + 1) + " sebesar " +
                nilaiTugas[mahasiswaTerbaik][mingguTerbaik]);
    }
}

import java.util.Scanner;
public class NilaiTugasLimaMahasiswa08Modif1 {

    public static void inputNilaiMahasiswa(String[][] nilaiMahasiswa) {
        Scanner scanner08 = new Scanner(System.in);

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i][0] = scanner08.next();

            for (int j = 1; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Masukkan nilai " + nilaiMahasiswa[i][0] + " pada tugas ke-" + j + ": ");
                nilaiMahasiswa[i][j] = String.valueOf(scanner08.nextInt());
            }
        }
    }

    public static void tampilkanNilaiMahasiswa(String[][] nilaiMahasiswa) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(nilaiMahasiswa[i][0] + ": ");
            for (int j = 1; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariHariNilaiTertinggi(String[][] nilaiMahasiswa) {
        int hariTertinggi = -1;
        int nilaiTertinggi = -1;

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            int totalNilaiHari = 0;

            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                totalNilaiHari += Integer.parseInt(nilaiMahasiswa[i][j]);
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j;
            }
        }

        return hariTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTertinggi(String[][] nilaiMahasiswa, int hariTertinggi) {
        System.out.println("\nMahasiswa dengan nilai tertinggi pada tugas ke-" + hariTertinggi + ":");
        int nilaiTertinggi = -1;
        String mahasiswaTertinggi = "";

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int nilaiTugas = Integer.parseInt(nilaiMahasiswa[i][hariTertinggi]);
            if (nilaiTugas > nilaiTertinggi) {
                nilaiTertinggi = nilaiTugas;
                mahasiswaTertinggi = nilaiMahasiswa[i][0];
            }
        }

        System.out.println(mahasiswaTertinggi + " dengan nilai " + nilaiTertinggi + " pada tugas ke-" + hariTertinggi);
    }

    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner08.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner08.nextInt();

        String[][] nilaiMahasiswa = new String[jumlahMahasiswa][jumlahTugas + 1];

        inputNilaiMahasiswa(nilaiMahasiswa);

        tampilkanNilaiMahasiswa(nilaiMahasiswa);

        int tugasTertinggi = cariHariNilaiTertinggi(nilaiMahasiswa);
        System.out.println("\nTugas ke-" + tugasTertinggi + " memiliki nilai tertinggi dari keseluruhan mahasiswa");

        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, tugasTertinggi);
    }
}
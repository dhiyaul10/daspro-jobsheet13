import java.util.Scanner;

public class UcapanTerimaKasih_08Modif1 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTambahan(String nama) {
        System.out.println("Ucapan tambahan untuk " + nama + ": Selamat terus berkarya!");
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
        UcapanTambahan(nama);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}

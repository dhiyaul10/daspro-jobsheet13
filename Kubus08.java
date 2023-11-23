import java.util.Scanner;
public class Kubus08 {
  
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }
    public static int hitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        Scanner scan08 = new Scanner(System.in);
        int s,LP,Vol;

        System.out.print("Masukkan panjang sisi :");
        s = scan08.nextInt();

        LP = hitungLuasPermukaan(s);
        System.out.println("Luas Persegi adalah :" +LP);

        Vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah :" +Vol);
    }
}
import java.util.Scanner;

public class Percobaan608 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang");
        p=input08.nextInt();
        System.out.println("Masukkan lebar");
        l=input08.nextInt();
        System.out.println("Masukkan tinggi");
        t=input08.nextInt();

        L=p*l;
        System.out.println("Luas Persegi panjang adalah"+L);

        vol=p*l*t;
        System.out.println("Volume balok adalah"+vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume= hitungLuas(a,b)*tinggi;
        return volume;
    }
    
}
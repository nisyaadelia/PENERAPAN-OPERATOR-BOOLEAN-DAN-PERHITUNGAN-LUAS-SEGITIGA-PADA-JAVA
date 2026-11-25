package Pertemuan2;
import java.util.Scanner;

public class tugasnomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nMenghitung luas segitiga dari 2 digit Terakhir NRP");
        System.out.println("Masukkan 2 digit terakhir NRP ");
        System.out.print("Digit Pertama: ");
        int a = sc.nextInt();
        System.out.print("Digit Kedua: ");
        int b = sc.nextInt();
        
        System.out.println("\nHasil koordinat");
        int x1 = -4, y1 = -3; // Titik A
        int x2 = a,  y2 = -3; // Titik B
        int x3 = -4, y3 = b;  // Titik C
        System.out.println("Titik A = (" + x1 + ", " + y1 + ")");
        System.out.println("Titik B = (" + x2 + ", " + y2 + ")");
        System.out.println("Titik C = (" + x3 + ", " + y3 + ")");

        System.out.println("\nHitung Panjang Sisi Segitiga");
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double AC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        System.out.printf("Panjang AB = %.2f\n", AB);
        System.out.printf("Panjang BC = %.2f\n", BC);
        System.out.printf("Panjang AC = %.2f\n", AC);

        System.out.println("\nHitung Luas Segitiga");
        double luas = 0.5 * Math.abs( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        System.out.printf("Luas Segitiga = %.2f\n", luas);

    }
}

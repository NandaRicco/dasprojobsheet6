package dasprojobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan314 {
    
    public static void main(String[] args) {
        
        Scanner empatbelas = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak=0;

        System.out.print("Masukkan Kategori (pekerja/pembisnis): ");
        kategori = empatbelas.nextLine();
        System.out.print("Masukkan Besarnya penghasilan        : ");
        penghasilan = empatbelas.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else if (kategori.equals("pembisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else 
            System.out.println("Masukkan kategori Salah");
    }
}

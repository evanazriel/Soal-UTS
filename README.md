# Soal-UTS
5 Soal UTS PEMROGRAMAN 2 
# 1. Konversi inci ke meter
```java
import java.util.Scanner;

public class latihan1uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai dalam meter : ");
        int meter = input.nextInt();
        double inch = meter * 39.37;
        System.out.println("Nilai konversi : " + inch);
    }
}
```
# 2. Menghitung Basic Metabolic Rate (MBR) 
```java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan2uts {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print ("Berat badan : ");
        int beratbadan = Integer.parseInt(br.readLine());
        System.out.print ("Tinggi badan : ");
        int tinggibadan = Integer.parseInt(br.readLine());
        System.out.print ("usia : ");
        int usia = Integer.parseInt(br.readLine());
        System.out.print ("Jenis kelamin : ");
        String kelamin = br.readLine();
        double bmr;
        if (kelamin.equals("pria")) {
            bmr = 88.362 + (13.397 * beratbadan) + (4.799 * tinggibadan) - (5.677 * usia);
        } else {
            bmr = 447.593 + (9.247 * beratbadan) + (3.098 * tinggibadan) - (4.330 * usia);
        }
        System.out.println ("Nilai BMR : " + bmr);
    }
}
```
# 3. Menghitung jarak ojek online dengan diskon 
```java
import java.util.Scanner;

public class latihan3uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Nama customer : ");
        String nama = input.nextLine();
        System.out.print ("Jarak yang akan ditempuh (km): ");
        int jarak = input.nextInt();
        double diskon = 0;
        double tarif;
        double total;
        if (jarak <= 4) {
            tarif = 9500;
        } else {
            tarif = 9500 + (jarak - 4) * 2500;
        }
        if (jarak > 0 && jarak <= 10) {
            diskon = 0;
        } else if (jarak > 10 && jarak <= 15) {
            diskon = 2000;
        } else if (jarak > 15) {
            diskon = 5000;
        }
        total = tarif - diskon;
        if (diskon > 0) {
            System.out.println("Selamat anda mendapatkan potongan Rp " + diskon);
        }

        System.out.println("Tarif yang harus dibayarkan " + nama + " adalah sebesar " + total);
    }
}

```
# 4. Menghitung pajak berdasarkan status (KAWIN/TIDAK KAWIN)
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan4uts {
    public static void main(String[] args) throws IOException {
        System.out.println("Status kategori" + "\n1. Tidak kawin" + "\n2. Kawin");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Input status kategori : ");
        int status = Integer.parseInt(br.readLine());
        System.out.print("Masukkan pendapatan anda dalam 1 tahun : ");
        int pendapatan = Integer.parseInt(br.readLine());
        double pajak = 0;
        if (status == 1) {
            if (pendapatan >= 0 && pendapatan <= 70000000) {.
                pajak = pendapatan * 0.05;
            } else if (pendapatan >= 70000000 && pendapatan <= 270000000) {
                pajak = pendapatan * 0.15;
            } else {
                pajak = pendapatan * 0.25;
            }
        } else if (status == 2) {
           if (pendapatan >= 0 && pendapatan <= 50000000) {
                pajak = pendapatan * 0.05;
            } else if (pendapatan >= 50000000 && pendapatan <= 250000000) {
                pajak = pendapatan * 0.15;
            } else {
                pajak = pendapatan * 0.25;
            } 
        }
        System.out.println("Pajak anda adalah sebesar : Rp " + String.format("%.0f", pajak));;
    }
}
```
# 5. Memvalidasi nilai menggunakan huruf (A-E)
```java
import javax.swing.JOptionPane;

public class latihan5uts {
    public static void main(String[] args) {
        String inputnilai = JOptionPane.showInputDialog(null, "Masukkan nilai (A-E) : ");
        char nilai = inputnilai.charAt(0);
        switch (nilai) {
            case 'A':
                JOptionPane.showMessageDialog(null, "Nilai Sangat baik");
            break;
            case 'B':
                JOptionPane.showMessageDialog(null, "Nilai baik");
            break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Nilai cukup");M
            break;
            case 'D':
                JOptionPane.showMessageDialog(null, "Nilai kurang");
            break;
             case 'E':
                JOptionPane.showMessageDialog(null, "Nilai gagal");
            break;

        }
    }
}
```

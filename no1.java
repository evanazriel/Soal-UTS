import java.util.Scanner;

public class latihan1uts {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Nilai dalam meter : ");
        int meter = input.nextInt();
        double inch = meter * 39.37;
        System.out.println("Nilai konversi : " + inch);
    }
}

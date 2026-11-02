import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print(j+1+(" "));
                total++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}
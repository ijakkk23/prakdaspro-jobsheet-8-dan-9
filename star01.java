import java.util.Scanner;

public class star01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i+= 2){
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
    
}
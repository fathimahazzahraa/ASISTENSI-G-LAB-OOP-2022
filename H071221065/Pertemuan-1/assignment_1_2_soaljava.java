import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment_1_2_soaljava {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        
        int desimal = 0;
        int bulat = 0;
        
        for (int i = 0; i < n; i++) {
            // System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
            double num = input.nextDouble();
            
            if (num % 1 == 0) {
                bulat++;
            } else {
                desimal++;
            }
        }
        
        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
        input.close();
    } catch (InputMismatchException e) {
        System.out.println("Hanya bisa menerima angka");
    }
    }
}

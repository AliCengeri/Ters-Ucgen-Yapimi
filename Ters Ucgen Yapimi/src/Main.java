import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak giriniz: ");
        int bas = input.nextInt();
        for (int i = bas; i > 0; i--) {
            for (int i2 = 0; i2 < bas-i; i2++)
                System.out.print(" ");
            for (int i3 = (2 * i)-1; i3 > 0; i3--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
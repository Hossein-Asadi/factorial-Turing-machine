import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplication3 multi1 = new Multiplication3();
        System.out.println("please enter input :");
        int n = scanner.nextInt();
        multi1.multi(n);
    }
}
